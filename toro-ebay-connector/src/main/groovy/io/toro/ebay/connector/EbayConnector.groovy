package io.toro.ebay.connector

import com.sun.xml.bind.marshaller.NamespacePrefixMapper

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import groovy.transform.TypeCheckingMode
import groovy.xml.XmlUtil
import groovyx.net.http.HTTPBuilder
import io.toro.ebay.model.finding.FindCompletedItemsRequest
import io.toro.ebay.model.finding.FindCompletedItemsResponse
import io.toro.ebay.model.finding.FindItemsAdvancedRequest
import io.toro.ebay.model.finding.FindItemsAdvancedResponse

import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBElement
import javax.xml.bind.Marshaller
import javax.xml.bind.Unmarshaller
import javax.xml.stream.XMLInputFactory
import javax.xml.stream.XMLStreamReader

import wslite.soap.SOAPClient
import wslite.soap.SOAPResponse

import com.fasterxml.jackson.databind.AnnotationIntrospector
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector
import com.fasterxml.jackson.databind.type.TypeFactory
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector
import com.sun.xml.bind.marshaller.NamespacePrefixMapper

@CompileStatic
class EbayConnector {
	private static final Map API_MAP = [ : ]
	private static final String RESPONSE_START = '<?xml version=\'1.0\' encoding=\'utf-8\'?><soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"><soapenv:Header/><soapenv:Body>'
	private static final String RESPONSE_END = '</soapenv:Body></soapenv:Envelope>'
	private static Map apiKeyMap = [ 'ebay.dev' : 'fe4b27ff-55a4-4427-b9f3-a3144ecfe8db', 'ebay.app' : 'TORO6e8cf-51d8-4d93-8948-746a8629fe3', 'cert' : '4938a8ac-72e7-4d4e-9b8f-7652ffd0b046']
	static httpClient = new HTTPBuilder('https://api.sandbox.ebay.com/ws/api.dll')
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
	@TypeChecked( TypeCheckingMode.SKIP )
	private static String getAliasContent( String apiKeyAlias ) {
		def output = apiKeyMap."ebay.${apiKeyAlias}"
		if ( output )
			return output
		String tempKey = apiKeyAlias.getTOROProperty()
		if ( !tempKey )
			throw new Exception( "No APIKey found for alias ${apiKeyAlias}" )
		String tokens = tempKey
		apiKeyMap.apiKeyAlias = tokens
		tokens
	}

	@TypeChecked( TypeCheckingMode.SKIP )
	private static <T> T contactEbay(String alias, String host, String action, String operationName , String xml, Class<T> clazz)
	{
		try {
			def client = new SOAPClient( host )
			SOAPResponse res = client.send(SOAPAction: action,
			headers:['X-EBAY-SOA-OPERATION-NAME': 'findCompletedItems', 'X-EBAY-SOA-SECURITY-APPNAME': 'TORO6e8cf-51d8-4d93-8948-746a8629fe3'],
											"""
											<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://www.ebay.com/marketplace/search/v1/services">
											   <soapenv:Header/>
											   <soapenv:Body>
													${xml}
											   </soapenv:Body>
											</soapenv:Envelope>
											""")
			String ser = XmlUtil.serialize(res.text)
//			println ser
			unmarshall(ser, clazz).getValue()
		} catch (all) {
			all.printStackTrace()
		}
	}

	private static <T> T contactEbayFindingAPI(String key, String operation, def request, Class<T> clazz){
		contactEbay(key,'https://svcs.ebay.com/services/search/FindingService/v1',
				'http://www.ebay.com/marketplace/search/v1/services', operation,
				marshall(request, request.getClass()), clazz)
	}

	@TypeChecked( TypeCheckingMode.SKIP )
	public static String marshall(Object request, Class<?> clazz){
		JAXBContext jc = JAXBContext.newInstance(clazz);
		Marshaller marshal = jc.createMarshaller()
		marshal.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.FALSE);
		marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
		marshal.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NamespacePrefixMapper() {
					@Override
					public String getPreferredPrefix(String arg0, String arg1, boolean arg2) {
						return "ser";
					}
				})
		StringWriter writer = new StringWriter()
		marshal.marshal(request,writer)
		//println writer.toString()
		writer.toString().replace('<', '<ser:').replace('<ser:/', '</ser:')
	}

	public static <T> JAXBElement<T> unmarshall(String response, Class<T> clazz){
		Reader reader = new StringReader(response);
		XMLInputFactory factory = XMLInputFactory.newInstance(); // Or newFactory()
		XMLStreamReader xmlReader = factory.createXMLStreamReader(reader);
		xmlReader.nextTag()
		xmlReader.nextTag()
		xmlReader.nextTag()
		xmlReader.nextTag()
		xmlReader.nextTag()
		JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		unmarshaller.unmarshal(xmlReader, clazz)
	}

	/**
	 * Trading API
	 * < a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/index.html">here</a>
	 */

	/**
	 * AddItem
	 * < a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddItem.html">here</a>
	 */

	public static FindCompletedItemsResponse test(String key, FindCompletedItemsRequest request){
		contactEbayFindingAPI('app', 'findCompletedItems', request, FindCompletedItemsResponse)
	}
	public static FindItemsAdvancedResponse test(String key, FindItemsAdvancedRequest request){
		contactEbayFindingAPI('app', 'findItemsAdvanced', request, FindItemsAdvancedResponse)
	}
//	public static FindItemsByCategoryResponse test(String key, FindItemsByCategoryRequest request){
//		contactEbayFindingAPI('app', 'findItemsByCategory', request, FindItemsByCategoryResponse)
//	}
//	public static FindItemsByImageResponse test(String key, FindItemsByImageRequest request){
//		contactEbayFindingAPI('app', 'findItemsByImage', request, FindItemsByImageResponse)
//	}
//	public static FindItemsByKeywordsResponse test(String key, FindItemsByKeywordsRequest request){
//		contactEbayFindingAPI('app', 'findItemsByKeywords', request, FindItemsByKeywordsResponse)
//	}
//	public static FindItemsByProductResponse test(String key, FindItemsByProductRequest request){
//		contactEbayFindingAPI('app', 'findItemsByProduct', request, FindItemsByProductResponse)
//	}
//	public static FindItemsIneBayStoresResponse test(String key, FindItemsIneBayStoresRequest request){
//		contactEbayFindingAPI('app', 'findItemsIneBayStores', request, FindItemsIneBayStoresResponse)
//	}
//	
//	public static GetMostWatchedItemsResponse test(String key, GetMostWatchedItemsRequest request){
//		contactEbayMerchandisingAPI('app', 'getMostWatchedItems', request, GetMostWatchedItemsResponse)
//	}
//	public static GetRelatedCategoryItemsResponse test(String key, GetRelatedCategoryItemsRequest request){
//		contactEbayMerchandisingAPI('app', 'getRelatedCategoryItems', request, GetRelatedCategoryItemsResponse)
//	}
//	public static GetSimilarItemsResponse test(String key, GetSimilarItemsRequest request){
//		contactEbayMerchandisingAPI('app', 'getSimilarItems', request, GetSimilarItemsResponse)
//	}
//	public static GetTopSellingProductsResponse test(String key, GetTopSellingProductsRequest request){
//		contactEbayMerchandisingAPI('app', 'getTopSellingProducts', request, GetTopSellingProductsResponse)
//	}
//	public static GetVersionResponse test(String key, GetVersionRequest request){
//		contactEbayMerchandisingAPI('app', 'getVersion', request, GetVersionResponse)
//	}
}
