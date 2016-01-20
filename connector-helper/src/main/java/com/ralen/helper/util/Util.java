package com.ralen.helper.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ralen.helper.ConnectorBootstrap;
import com.ralen.helper.ConnectorConfig;
import com.ralen.helper.builder.DocumentCallback;
import com.ralen.helper.builder.ElementProcessor;
import com.ralen.helper.builder.Fetcher;
import com.ralen.helper.builder.Mapper;

public class Util {

	private static final Logger logger = LoggerFactory.getLogger(Util.class);

	public static List<String> getLinksByClass(String clazz, Document document) {
		Elements elements = document.select(clazz);
		return elementsToUrlList(elements);
	}

	public static List<String> getLinksByText(String text, Document document) {
		Elements elements = document.getElementsMatchingOwnText(text);
		return elementsToUrlList(elements);
	}

	public static List<String> elementsToUrlList(Elements elements) {
		return elementsToUrlList(elements, "");
	}
	
	public static List<String> elementsToUrlList(Elements elements, String app) {
		List<String> urls = new ArrayList<String>();
		Iterator<Element> i = elements.iterator();
		while (i.hasNext()) {
			Element e = i.next();
			String sUrl = e.attr("href");
			if (sUrl == null || sUrl.length() == 0) {
			} else {
				logger.info("Found link " + app + sUrl);
				urls.add(app + sUrl);
			}
		}
		return urls;
	}

	public static List<String> elementsToTextList(Elements elements, String append) {
		List<String> text = new ArrayList<String>();
		Iterator<Element> i = elements.iterator();
		while (i.hasNext()) {
			Element e = i.next();
			text.add(append + e.text());
		}
		return text;
	}
	
	public static List<String> elementsToTextList(Elements elements) {
		return elementsToTextList(elements, "");
	}

	public static Mapper links(String clazz, DocumentCallback doc) {
		return links(clazz, null, doc);
	}
	
	public static Mapper links(String clazz) {
		return links(clazz, "", null);
	}

	public static Mapper links(String clazz, String base) {
		return links(clazz, base, null);
	}

	private static Mapper links(String clazz, String base, DocumentCallback doc) {
		return (e) -> {
			List<String> uri = Util.elementsToUrlList(e.select(clazz));
			if (doc != null) {
				for (int x = 0; x < uri.size(); x++) {
					logger.info("Found child " + uri.get(x));
					uri.set(x, doc.format(e) + uri.get(x));
				}
			} else {
				for (int x = 0; x < uri.size(); x++) {
					logger.info("Found child " + uri.get(x));
					uri.set(x, base + uri.get(x));
				}
			}
			return uri;
		};
	}

	public static Mapper texts(String text) {
		return Util.texts(text, "");
	}

	public static GroovyFile fetchClass(String url, Fetcher fetcher, ElementProcessor processor, String packName) {
		try {
			Document doc = Jsoup.connect(url).timeout(ConnectorConfig.TIME_OUT).get();

			GroovyFile gfile = new GroovyFile(fetcher.getName(doc));
			logger.info("Processing file " + gfile.getName());
			gfile.setEnumeration(fetcher.isEnumeration(doc));
			gfile.setDocumentation(fetcher.getDocumentation(doc));
			FetchResult result = fetcher.fetch(doc);
			logger.info("Fetch size " + result.getElements().size());
			result.getElements().forEach(fe -> {
				if (processor.isValid(fe)) {
					gfile.addField(processor.process(fe, result.getParams()));
				}
			});
			logger.info("Processing size " + gfile.getFields().size());
			gfile.setBasePackage(packName);
			return gfile;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static Mapper texts(String text, String base) {
		return (e) -> {
			List<String> uri = Util.elementsToUrlList(e.getElementsMatchingOwnText(text));
			for (int x = 0; x < uri.size(); x++) {
				uri.set(x, base + uri.get(x));
			}
			return uri;
		};
	}
}
