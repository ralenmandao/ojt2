package io.toro.ebay.connector

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import groovy.transform.TypeCheckingMode
import groovy.xml.XmlUtil
import io.toro.ebay.model.finding.FindCompletedItemsRequest
import io.toro.ebay.model.finding.FindCompletedItemsResponse
import io.toro.ebay.model.finding.FindItemsAdvancedRequest
import io.toro.ebay.model.finding.FindItemsAdvancedResponse
import io.toro.ebay.model.finding.FindItemsByCategoryRequest
import io.toro.ebay.model.finding.FindItemsByCategoryResponse
import io.toro.ebay.model.finding.FindItemsByKeywordsRequest
import io.toro.ebay.model.finding.FindItemsByKeywordsResponse
import io.toro.ebay.model.finding.FindItemsByProductRequest
import io.toro.ebay.model.finding.FindItemsByProductResponse
import io.toro.ebay.model.finding.FindItemsIneBayStoresRequest
import io.toro.ebay.model.finding.FindItemsIneBayStoresResponse
import io.toro.ebay.model.finding.GetHistogramsRequest
import io.toro.ebay.model.finding.GetHistogramsResponse
import io.toro.ebay.model.finding.GetSearchKeywordsRecommendationRequest
import io.toro.ebay.model.finding.GetSearchKeywordsRecommendationResponse
import io.toro.ebay.model.merchandising.GetMostWatchedItemsRequest
import io.toro.ebay.model.merchandising.GetMostWatchedItemsResponse
import io.toro.ebay.model.merchandising.GetRelatedCategoryItemsRequest
import io.toro.ebay.model.merchandising.GetRelatedCategoryItemsResponse
import io.toro.ebay.model.merchandising.GetSimilarItemsRequest
import io.toro.ebay.model.merchandising.GetSimilarItemsResponse
import io.toro.ebay.model.merchandising.GetTopSellingProductsRequest
import io.toro.ebay.model.merchandising.GetTopSellingProductsResponse
import io.toro.ebay.model.merchandising.GetVersionRequest
import io.toro.ebay.model.merchandising.GetVersionResponse

import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBElement
import javax.xml.bind.Marshaller
import javax.xml.bind.Unmarshaller
import javax.xml.stream.XMLInputFactory
import javax.xml.stream.XMLStreamReader

import wslite.soap.SOAPClient
import wslite.soap.SOAPResponse

@CompileStatic
class EbayConnector {
	private static Map apiKeyMap = [ 'ebay.dev' : 'fe4b27ff-55a4-4427-b9f3-a3144ecfe8db', 'ebay.app' : 'TORO6e8cf-51d8-4d93-8948-746a8629fe3', 'cert' : '4938a8ac-72e7-4d4e-9b8f-7652ffd0b046']

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
	private static <T> T contactEbay(String alias, String host, String action, String operationName , String xml, Class<T> clazz) {
		try {
			def client = new SOAPClient( host )
			SOAPResponse res = client.send(SOAPAction: action,
			headers:['X-EBAY-SOA-OPERATION-NAME': operationName, 'X-EBAY-SOA-SECURITY-APPNAME': apiKeyMap."ebay.${alias}"],
			"""
						<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://www.ebay.com/marketplace/search/v1/services">
						   <soapenv:Header/>
						   <soapenv:Body>
								${xml}
						   </soapenv:Body>
						</soapenv:Envelope>
					""")
			String ser = XmlUtil.serialize(res.text)
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
	
	private static <T> T contactEbayMerchandisingAPI(String key, String operation, def request, Class<T> clazz){
		contactEbay(key,'http://svcs.ebay.com/MerchandisingService',
				'http://www.ebay.com/marketplace/services', operation,
				marshall(request, request.getClass()), clazz)
	}

	@TypeChecked( TypeCheckingMode.SKIP )
	public static String marshall(Object request, Class<?> clazz){
		JAXBContext jc = JAXBContext.newInstance(clazz);
		Marshaller marshal = jc.createMarshaller()
		marshal.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.FALSE);
		//		marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
		//		marshal.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NamespacePrefixMapper() {
		//					@Override
		//					public String getPreferredPrefix(String arg0, String arg1, boolean arg2) {
		//						return "ser";
		//					}
		//				})
		StringWriter writer = new StringWriter()
		marshal.marshal(request,writer)
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
	public static FindItemsByCategoryResponse test(String key, FindItemsByCategoryRequest request){
		contactEbayFindingAPI('app', 'findItemsByCategory', request, FindItemsByCategoryResponse)
	}
	public static FindItemsByKeywordsResponse test(String key, FindItemsByKeywordsRequest request){
		contactEbayFindingAPI('app', 'findItemsByKeywords', request, FindItemsByKeywordsResponse)
	}
	public static FindItemsByProductResponse test(String key, FindItemsByProductRequest request){
		contactEbayFindingAPI('app', 'findItemsByProduct', request, FindItemsByProductResponse)
	}
	public static FindItemsIneBayStoresResponse test(String key, FindItemsIneBayStoresRequest request){
		contactEbayFindingAPI('app', 'findItemsIneBayStores', request, FindItemsIneBayStoresResponse)
	}
	public static GetSearchKeywordsRecommendationResponse test(String key, GetSearchKeywordsRecommendationRequest request){
		contactEbayFindingAPI('app', 'findItemsIneBayStores', request, GetSearchKeywordsRecommendationResponse)
	}
	public static GetHistogramsResponse test(String key, GetHistogramsRequest request){
		contactEbayFindingAPI('app', 'findItemsIneBayStores', request, GetHistogramsResponse)
	}
	public static GetMostWatchedItemsResponse test(String key, GetMostWatchedItemsRequest request){
		contactEbayMerchandisingAPI('app', 'getMostWatchedItems', request, GetMostWatchedItemsResponse)
	}
	public static GetRelatedCategoryItemsResponse test(String key, GetRelatedCategoryItemsRequest request){
		contactEbayMerchandisingAPI('app', 'getRelatedCategoryItems', request, GetRelatedCategoryItemsResponse)
	}
	public static GetSimilarItemsResponse test(String key, GetSimilarItemsRequest request){
		contactEbayMerchandisingAPI('app', 'getSimilarItems', request, GetSimilarItemsResponse)
	}
	public static GetTopSellingProductsResponse test(String key, GetTopSellingProductsRequest request){
		contactEbayMerchandisingAPI('app', 'getTopSellingProducts', request, GetTopSellingProductsResponse)
	}
	public static GetVersionResponse test(String key, GetVersionRequest request){
		contactEbayMerchandisingAPI('app', 'getVersion', request, GetVersionResponse)
	}
	
}
