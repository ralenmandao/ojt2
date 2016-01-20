package velocity;

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

public class Main {

	public static void main(String[] args) {
		def fields = []
		
		Document doc = Jsoup.connect("http://developer.ebay.com/Devzone/finding/CallRef/findCompletedItems.html").get();
		new File("src/","FindCompletedItemsRequest.groovy").withWriter('utf-8') { writer ->
			doc.select('#stdInputTable > tbody > tr').each{ Element it ->
				def name = it.getElementsByTag('td')[0].text()
				def type = it.getElementsByTag('td')[1].text()
				if(!name.contains('.')){
					println it.getElementsByTag('td')[0].text()
					println it.getElementsByTag('td')[1].text()
					println ''
				}
			}
		}
//		createModel()
	}
	
	static def apiModels = [
		'http://developer.ebay.com/Devzone/finding/CallRef/types/'
//			'http://developer.ebay.com/Devzone/merchandising/docs/CallRef/types/',
//			'http://developer.ebay.com/Devzone/shopping/docs/CallRef/types/',
//			'http://developer.ebay.com/DevZone/merchant-data/CallRef/types/',
//			'http://developer.ebay.com/DevZone/bulk-data-exchange/CallRef/types/',
//			'http://developer.ebay.com/DevZone/file-transfer/CallRef/types/',
//			'http://developer.ebay.com/Devzone/post-order/types/',
//			'http://developer.ebay.com/Devzone/business-policies/CallRef/types/',
//			'http://developer.ebay.com/Devzone/related-items/CallRef/types/',
//			'http://developer.ebay.com/Devzone/client-alerts/docs/CallRef/types/',
//			'http://developer.ebay.com/Devzone/feedback/CallRef/types/',
//			'http://developer.ebay.com/Devzone/product/CallRef/types/',
//			'http://developer.ebay.com/Devzone/product-metadata/CallRef/types/',
//			'http://developer.ebay.com/Devzone/resolution-case-management/CallRef/types/',
//			'http://developer.ebay.com/Devzone/listing-recommendation/CallRef/types/',
//			'http://developer.ebay.com/Devzone/return-management/CallRef/types/'
	]
	
	static def createModel(){
		apiModels.each{ apiModel ->
			Document doc = Jsoup.connect("${apiModel}index.html").get();
			doc.getElementsByClass('nohi').findAll{ Element it ->
				it.text().size() != 1
			}.each{ element ->
				new File("src/","${element.text()}.groovy").withWriter('utf-8') { writer ->
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
						writer.writeLine "import javax.xml.bind.annotation.*"
						
						writer.writeLine "@ToString(includeNames=true)"
						writer.writeLine "@XmlAccessorType( XmlAccessType.FIELD )"
						writer.writeLine "@XmlRootElement"
						
						writer.writeLine "public class ${element.text()} {"
						getTypeField("${apiModel}${element.attr('href')}").each{
							def type = it[1]
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
							
							if(it[2] == null){
								writer.writeLine "\t@XmlAttribute"
							}
							writer.writeLine "\t${type} ${it[0]};"
						}
						writer.writeLine '}'
					}
					}catch(all){
						//println element
					}
				}
			}
		}
	}

	static def javaClassCreator(){
		
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
		def elements = []
		
//		fieldsDoc.getElementsByClass('elementID').each{
//			if(it.text().replace('(', '').split(' ').size() < 5){
//				println it
//			}
//		}
		
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
