package com.ralen.helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.text.WordUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ralen.helper.builder.CallMapper;
import com.ralen.helper.builder.DataTypeResolver;
import com.ralen.helper.builder.ElementProcessor;
import com.ralen.helper.builder.Fetcher;
import com.ralen.helper.builder.GroovyFileProcessor;
import com.ralen.helper.builder.Mapper;
import com.ralen.helper.builder.ServiceMapper;
import com.ralen.helper.util.FetchResult;
import com.ralen.helper.util.GroovyClassContext;
import com.ralen.helper.util.GroovyFile;
import com.ralen.helper.util.Service;

/**
 * This class is for fetching rest/soap/sdk request and response model of an existing
 * api documentation, by providing your own implementation this can work in any
 * api as long as you use the right approach in scraping data from the documentation
 * 
 * This class will recursively go to each link you mapped and fetch data for you,
 * but the fetching and processing of data is in your hands
 * 
 * The primary strategy is you must first map all the urls of the services in the baseUri
 * using their classes(in most cases its not easy to filter urls so i prefer if you read
 * some advance css selector and the Jsoup documentation) then in the services you must 
 * map the call url's and so on. then you can fetch data by specifying the element that 
 * contains the type, name and documentation of a fieldm (in most cases a table row) , 
 * you also need to write an element processor where you need to process the fetch data 
 * and turn it into field
 * 
 * when every request and response models are in the context you can call build to turn them into
 * a groovy file. you can create your own groovy file creator implementation to customize how
 * the groovy file creation behaves, you can for example add a @XMLAttribute annotation to all attribute
 * fields or add @JsonProperty.
 * 
 * @author ralen.mandap
 * @version 0.1
 */
public class ConnectorBootstrap {

	private static Logger logger = LoggerFactory.getLogger(ConnectorBootstrap.class);

	/* Base package of each class */
	private String basePackage;
	/* Spring application context for dependency injection */
	private ApplicationContext context;
	/* The parent document of the baseUri */
	private Document document;
	/* list of the uri that was previously mapped */
	private List<String> callsURI;
	private int TIME_OUT = 2000;
	/* this will contain all the groovy file that was fetch */
	private GroovyClassContext classContext;
	/* contains all the services that was mapped using mapSevice method */
	private List<Service> service;
	/* the folder in which each groovy files will be saved */
	private String parentFolder;

	/**
	 * ConnectorBootstrap constructor
	 * 
	 * @param basePackage the basePackage of all classes
	 * @param baseUri base uri to mapped
	 * @param clazz for dependency injection
	 * @param parentFolder folder location to save the classes
	 */
	public ConnectorBootstrap(String basePackage, String baseUri, Class<?> clazz, String parentFolder) {
		this.context = new AnnotationConfigApplicationContext(clazz);
		this.basePackage = basePackage;
		this.parentFolder = parentFolder;
		try {
			this.document = Jsoup.connect(baseUri).timeout(TIME_OUT).followRedirects(true).userAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/535.21 (KHTML, like Gecko) Chrome/19.0.1042.0 Safari/535.21").get();
			System.out.println(document);
		} catch (IOException e) {
			logger.error("Invalid base uri cannot access");
			e.printStackTrace();
		}
		service = new ArrayList<>();
		callsURI = new ArrayList<>();
		classContext = new GroovyClassContext();
	}

	/**
	 * Instead of mapping service url's you can call this method to explicitly add a service
	 * url to the service
	 * 
	 * @param serviceName name of the service
	 * @param url url of the service
	 * @return this instance
	 */
	public ConnectorBootstrap use(String serviceName, String url) {
		service.add(new Service(serviceName, url));
		return this;
	}

	/**
	 * Iterate on each mapped uri to fetch data and process them ,
	 * when each field is processed we will create a groovy file instance
	 * to save them in the context
	 * 
	 * @param fetcher Fetch strategy to use for fetching element
	 * @param processor Processing strategy to turn element to a field
	 * @param append The text to append on each groovy file name
	 * @param packageName the package of the process class
	 * @return this instance
	 */
	public ConnectorBootstrap fetchFromURI(Fetcher fetcher, ElementProcessor processor, String append,
			String packageName) {
		fetch(callsURI, fetcher, processor, append, basePackage + "." + packageName);
		return this;
	}

	/**
	 * Iterate on each call from a service, this method assumes that you already
	 * called mapService or added few services url before fetching data
	 * 
	 * @param fetcher
	 * @param processor
	 * @param append
	 * @return
	 */
	public ConnectorBootstrap fetchFromService(Fetcher fetcher, ElementProcessor processor, String append) {
		service.forEach(ser -> {
			fetch(ser.getCalls().values(), fetcher, processor, append, basePackage + "." + ser.getService());
		});
		return this;
	}

	private ConnectorBootstrap fetch(Collection<String> uri, Fetcher fetcher, ElementProcessor processor, String append,
			String pack) {
		uri.forEach(url -> {
			try {
				Document d = Jsoup.connect(url).timeout(TIME_OUT).get();
				GroovyFile gfile = new GroovyFile(fetcher.getName(d) + WordUtils.capitalize(append));
				gfile.setDocumentation(fetcher.getDocumentation(d));
				gfile.setEnumeration(fetcher.isEnumeration(d));
				FetchResult res = fetcher.fetch(d);
				res.getElements().forEach(fe -> {
					if (processor.isValid(fe)) {
						gfile.addField(processor.process(fe, res.getParams()));
					} else {
						logger.info("Not valid " + fe.text());
					}
				});
				logger.info("Field size : " + gfile.getFields().size());
				gfile.setBasePackage(pack);
				classContext.add(gfile.getName(), gfile);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		return this;
	}

	public ConnectorBootstrap mapService(ServiceMapper mapper) {
		if (callsURI.size() == 0) {
			List<String> uri = mapper.getURI(document);
			uri.forEach(e -> {
				try {
					logger.info("Mapping " + e);
					Document d = Jsoup.connect(e).timeout(TIME_OUT).get();
					service.add(new Service(mapper.getServiceName(d), e));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			});
		} else {
			callsURI.forEach(cu -> {
				try {
					Document d = Jsoup.connect(cu).timeout(TIME_OUT).get();
					List<String> uri = mapper.getURI(d);
					uri.forEach(e -> {
						try {
							Document myDoc = Jsoup.connect(e).timeout(TIME_OUT).get();
							service.add(new Service(mapper.getServiceName(myDoc), e));
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					});
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
		return this;
	}

	public ConnectorBootstrap clear() {
		callsURI.clear();
		return this;
	}

	public ConnectorBootstrap mapCall(CallMapper callMapper) {
		service.forEach(ser -> {
			logger.info("Mapping calls for service " + ser.getService());
			try {
				Document d = Jsoup.connect(ser.getUrl()).timeout(TIME_OUT).get();
				logger.info("Mapping calls size " + callMapper.getURI(d).size());
				callMapper.getURI(d).forEach(uri -> {
					logger.info("Detected call " + uri);
					try {
						Document uriD = Jsoup.connect(uri).timeout(TIME_OUT).get();
						if (!callMapper.isDeprecated(uriD)) {
							ser.add(callMapper.getCallName(uriD), uri);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				});

			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return this;
	}

	public ConnectorBootstrap map(Mapper mapper) {
		if (callsURI.size() == 0) {
			callsURI = mapper.getURI(document);
			logger.info("size : " + callsURI.size());
			return this;
		}
		List<String> list = new ArrayList<>();
		callsURI.forEach(e -> {
			try {
				list.addAll(mapper.getURI(Jsoup.connect(e).timeout(TIME_OUT).get()));
			} catch (Exception e1) {
				logger.error("Error adding list of " + e);
				e1.printStackTrace();
			}
		});
		callsURI = list;
		logger.info("size : " + list.size());
		return this;
	}

	public void build(GroovyFileProcessor creator) {
		classContext.getFiles().forEach((name, gf) -> {
			gf.create(creator, parentFolder);
		});
	}

	public void build(GroovyFileProcessor creator, DataTypeResolver resolver) {
		classContext.getFiles().forEach((name, gf) -> {
			gf.create(creator, resolver, parentFolder);
		});
	}
}
