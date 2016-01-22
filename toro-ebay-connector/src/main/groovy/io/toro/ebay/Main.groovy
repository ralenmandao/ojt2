package io.toro.ebay

import io.toro.ebay.connector.EbayConnector
import io.toro.ebay.model.merchandising.GetMostWatchedItemsRequest

import javax.xml.bind.annotation.*
import javax.xml.transform.OutputKeys
import javax.xml.transform.Source
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.stream.StreamResult
import javax.xml.transform.stream.StreamSource

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

import com.fasterxml.jackson.databind.AnnotationIntrospector
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector
import com.fasterxml.jackson.databind.type.TypeFactory
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector

class Main {
	private static ObjectMapper mapper

	static {
		// configure jackson and enable it to use Jackson and JAXB annotations on our beans
		if ( mapper == null ) {
			mapper = new ObjectMapper()
			mapper.setAnnotationIntrospector( AnnotationIntrospector.pair(
			new JacksonAnnotationIntrospector(),
			new JaxbAnnotationIntrospector( TypeFactory.defaultInstance() ) )
			)
		}
	}

	static def apiModels = [
		'http://developer.ebay.com/Devzone/finding/CallRef/types/',
		'http://developer.ebay.com/Devzone/merchandising/docs/CallRef/types/',
		'http://developer.ebay.com/Devzone/shopping/docs/CallRef/types/',
		'http://developer.ebay.com/DevZone/merchant-data/CallRef/types/',
		'http://developer.ebay.com/DevZone/bulk-data-exchange/CallRef/types/',
		'http://developer.ebay.com/DevZone/file-transfer/CallRef/types/',
		'http://developer.ebay.com/Devzone/business-policies/CallRef/types/',
		'http://developer.ebay.com/Devzone/related-items/CallRef/types/',
		'http://developer.ebay.com/Devzone/client-alerts/docs/CallRef/types/',
		'http://developer.ebay.com/Devzone/feedback/CallRef/types/',
		'http://developer.ebay.com/Devzone/product/CallRef/types/',
		'http://developer.ebay.com/Devzone/product-metadata/CallRef/types/',
		'http://developer.ebay.com/Devzone/resolution-case-management/CallRef/types/',
		'http://developer.ebay.com/Devzone/listing-recommendation/CallRef/types/',
		'http://developer.ebay.com/Devzone/return-management/CallRef/types/'
	]

	static main(args){
		//		FindCompletedItemsResponse resp = EbayConnector.test('app', new FindCompletedItemsRequest(categoryId: [156955], keywords: 'Garmin nuvi 1300 Automotive GPS Receiver'));
		//		println resp;
		//		FindItemsAdvancedResponse resp1 = EbayConnector.test('app', new FindItemsAdvancedRequest(keywords: 'tolkien'))
		//		println resp1;
		//		println EbayConnector.test('app', new FindItemsByProductRequest(productId: new ProductId(type: 'ReferenceID', value: '53039031')))
		//		println EbayConnector.test('app', new FindItemsIneBayStoresRequest(keywords: 'FASHION', storeName: "bargainmanila", outputSelector: [OutputSelectorType.StoreInfo]))
        //		println EbayConnector.test('app', new FindItemsIneBayStoresRequest(keywords: 'FASHION', storeName: "bargainmanila", outputSelector: [OutputSelectorType.StoreInfo]))
				println EbayConnector.test('app', new GetMostWatchedItemsRequest())
		}
	
	
	static void doSomething(){
		/* get all call reference */
		def locations = getCallRef();
		boolean isTrading = true
		
		/*Suspicious Types*/
		def susFile = new File("src/main/resources/susType.txt");
		if(!susFile.exists()){
			susFile.createNewFile();
		}
		PrintWriter pw = new PrintWriter("src/main/resources/susType.txt");
		pw.close();
			
		def apis = new File("src/main/resources/apis.txt");
		if(!susFile.exists()){
			susFile.createNewFile();
		}
		PrintWriter pw2 = new PrintWriter("src/main/resources/apis.txt");
		pw.close();
	
		
		/* Go to each location and look for each attributes */
		locations.each{ callRef ->
			if(isTrading){
				isTrading = false
				return;
			}
			getApiCall(callRef).each{ apiCall ->
				println "@ ${callRef + apiCall}"
//				def req = getRequestAttributes('#stdInputTable > tbody > tr',callRef + apiCall, susFile, 'Request')
//				if(req.size() == 0){
//					susFile.append("Suspicious ${callRef + apiCall} has no request attr\n")
//				}
//				groovyFileCreator(req, apiCall.replace('.html', '').capitalize() + 'Request', "src/request/${callRef.split('/')[4]}")
//				
//				def res = getRequestAttributes('#stdOutputTable > tbody > tr',callRef + apiCall, susFile, 'Response')
//				if(res.size() == 0){
//					susFile.append("Suspicious ${callRef + apiCall} has no request attr\n")
//				}
//				groovyFileCreator(res, apiCall.replace('.html', '').capitalize() + 'Response', "src/response/${callRef.split('/')[4]}")
			
				// for api call 
				Thread.sleep(100)
				String name = apiCall.replace('.html', '').capitalize()
				if(!name){ 
					println "ERROR @ : ${callRef + apiCall}" 
					return
				}
				apis.append "public static ${name}Response test(String key, ${name}Request request){\n"
				apis.append "\tcontactEbay${callRef.split('/')[4].replace('-','').capitalize()}API('app', '${Character.toLowerCase(name.charAt(0))}${name.substring(1)}', request, ${name}Response)\n"
				apis.append "}\n"
			}
		}
	}
	
	public static def getRequestAttributes(css,page,susFile,app){
		Document doc = Jsoup.connect(page).get();
		println "\t${doc.select('#doc > h1').text()}${app}"
		def reqs = []
		def registered = []
		doc.select(css).each {
			def name = it.select('td:nth-child(1)').text()
			def type = it.select('td:nth-child(2)').text()
			
			if(type.split(' ').size() > 1){
				susFile.append("Suspicious type ${type} ${page}\n")
			}
			
			type = type.split(' ')[0]
			
			if(type == 'string' || type == 'token' || type == 'anyURI' || type == 'dateTime'){
				type = 'String'
			}else if(type.toLowerCase() == 'amount'){
				type = 'double'
			}
			
			if(name.split(' ').size() > 1){
				susFile.append("Suspicious type ${name} ${page}\n")
			}
			
			name = name.split(' ')[0]
			
			def occ = it.select('td:nth-child(3)').text()
			if(!name.contains('.') && !registered.contains(name)){
				if(occ.contains('repeatable')){
					println "\t\tList<${type}> ${name}"
					reqs << "List<${type}> ${name}"
				}else{
					println "\t\t${type} ${name}"
					reqs << "${type} ${name}"
				}
				registered << name;
			}
		}
		reqs
	}
	
	public static def getApiCall(callRef){
		Document doc = Jsoup.connect(callRef).get();
		def apiCalls = []
		doc.select('#doc > table > tbody > tr:not(:first-child)').each{
			 apiCalls << it.select('td:first-child a').attr('href')
		}
		apiCalls
	}
	
	
	public static String prettyFormat(String input, int indent) {
		try {
			Source xmlInput = new StreamSource(new StringReader(input));
			StringWriter stringWriter = new StringWriter();
			StreamResult xmlOutput = new StreamResult(stringWriter);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformerFactory.setAttribute("indent-number", indent);
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(xmlInput, xmlOutput);
			return xmlOutput.getWriter().toString();
		} catch (Exception e) {
			throw new RuntimeException(e); // simple exception handling, please review it
		}
	}
	
	
	static def getCallRef(){
		Document doc = Jsoup.connect("https://go.developer.ebay.com/api-documentation").get();
		def types = []
		doc.getElementsContainingOwnText('Call Reference').each{
			def url = it.attr('href').replace('index.html', '')
			if(url){
				types << url
			}
		}
		types
	}
	
	static def createModel(){
		apiModels.each{ apiModel ->
			Document doc = Jsoup.connect("${apiModel}index.html").get();
			doc.getElementsByClass('nohi').findAll{ Element it ->
				it.text().size() != 1
			}.each{ element ->
				new File("src/main/groovy/io/toro/ebay/model","${element.text()}.groovy").withWriter('utf-8') { writer ->
					try{
					if(isEnumeration("${apiModel}${element.attr('href')}")){
						writer.writeLine "package io.toro.ebay.model\n"
						writer.writeLine "public enum ${element.text()} {"
						def fields = []
						getEnumerationFields("${apiModel}${element.attr('href')}").each{
							fields << it.text()
						}
						def enums = fields.join(',')
						writer.writeLine "\t${enums};\n}"
						writer.close()
					}else{
						writer.writeLine "package io.toro.ebay.model\n"
						writer.writeLine "import groovy.transform.ToString\n"
						writer.writeLine "import javax.xml.bind.annotation.XmlAccessType"
						writer.writeLine "import javax.xml.bind.annotation.XmlAccessorType"
						writer.writeLine "import javax.xml.bind.annotation.XmlRootElement\n"
						
						writer.writeLine "@ToString(includeNames=true)"
						writer.writeLine "@XmlAccessorType( XmlAccessType.FIELD )"
						writer.writeLine "@XmlRootElement"
						
						writer.writeLine "public class ${element.text()} {"
						getTypeField("${apiModel}${element.attr('href')}").each{
							def type = it[1]
							if(type == 'see'){
								println "See attribute @ ${apiModel}${element.attr('href')}"
								type = type.split(' ')[1];
								writer.writeLine '@XmlAttribute'
							}
							if(it[1] == 'string' || it[1] == 'token'){
								type = 'String'
							}else if(it[1] == 'anyURI'){
								type = 'URL'
							}else if(it[1] == 'dateTime'){
								type = 'Date'
							}
							if(it[2] == '[1..*]' || it[2] == '[0..*]'){
								type = "List<${type}>"
							}
							writer.writeLine "\t${type} ${it[0]};"
						}
						writer.writeLine '}'
					}
					}catch(all){
						println "${apiModel}${element.attr('href')} @ Element ${element}"
					}
				}
			}
		}
	}

	static void groovyFileCreator(def attrs, def filename,def parentFolder){
		println parentFolder
		File parent = new File(parentFolder.replace('-', ''));
		if(!parent.exists()) parent.mkdirs()
		
		File myFile = new File(parent, "${filename}.groovy")
		if(!myFile.exists()) myFile.createNewFile();
		myFile.withWriter('utf-8') { writer ->
			try{
				writer.writeLine "package io.toro.ebay.model.${parentFolder.split('/')[2].replace('-','')}\n"
				writer.writeLine "import groovy.transform.ToString\n"
				writer.writeLine "import javax.xml.bind.annotation.XmlAccessType"
				writer.writeLine "import javax.xml.bind.annotation.XmlAccessorType"
				writer.writeLine "import javax.xml.bind.annotation.XmlRootElement\n"
				
				attrs.each{
					String name = it;
					String type = it.split(' ')[0];
					if(type.contains('<')){
						type = type.split('<')[1];
						type = type.substring(0,type.length() - 1)
					}
					if(type == 'boolean' || type == 'String' || type == 'int' || type == 'double'){
						return
					}
					writer.writeLine "import io.toro.ebay.model.${type}"
				}
				
				writer.writeLine "@ToString(includeNames=true)"
				writer.writeLine "@XmlAccessorType( XmlAccessType.FIELD )"
				writer.writeLine "@XmlRootElement(name = '${filename}')"
				
				writer.writeLine "public class ${filename} {"
				attrs.each{
					writer.writeLine "\t${it}";
				}
				writer.writeLine '}'
			}catch(all){
				all.printStackTrace()
			}
		}
	}
	
	static def getEnumerationFields(link){
		Document fieldsDoc = Jsoup.connect("${link}").get();
		def elements = []
		def es = fieldsDoc.getElementsByClass('tdEnum')
		int num = 0;
		for(def elem: es){
			if(num == 1) {
				num = 0;
				continue;
			}	
			num++
			elements << elem
		}
		elements
	}

	static def getTypeField(link){
		Document fieldsDoc = Jsoup.connect("${link}").get();
		Elements es = fieldsDoc.getElementsMatchingOwnText('Attribute');
		es.each { Element e ->
			if(e.tag().getName().equals("h2")){
				println "Has attributes ${link}"
			}
//			println e.tag()
		}
		
		def elements = []
		def c1 = fieldsDoc.getElementsByClass('elementID').collect{
			[it.text().replace('(', '').split(' ')[0], it.text().replace('(', '').split(' ')[2], it.text().replace('(', '').split(' ').size() >= 5 ? it.text().replace('(', '').split(' ')[4] : null ]
		}
	}
	
	static boolean isEnumeration(link){
		Document fieldsDoc = Jsoup.connect("${link}").get();
		Element sup =  fieldsDoc.getElementById('doc')
		Element newElement = sup.getElementsByTag('h2')[0]
		newElement.text() == "Enumeration Values"
	}
}
	