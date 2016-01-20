
import groovyx.net.http.HttpResponseException

import org.apache.commons.lang3.StringUtils
import org.apache.commons.io.*

import groovy.xml.StreamingMarkupBuilder
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method
import groovyx.net.http.RESTClient
import groovyx.net.http.Method.*
import wslite.soap.*

class EbayConnector {

	//<=== S T A R T ===>
	
	private static Map apiKeyMap = [ : ]
	static httpClient = new HTTPBuilder('https://api.sandbox.ebay.com/ws/api.dll')
	
	private static String getAliasContent( String apiKeyAlias ) {
		def output = apiKeyMap.apiKeyAlias
		if ( output )
			return output
		String tempKey = apiKeyAlias.getTOROProperty()
		if ( !tempKey )
			throw new Exception( "No APIKey found for alias ${apiKeyAlias}" )
		String tokens = tempKey
		apiKeyMap.apiKeyAlias = tokens
		tokens
	}
	
	private static def contactEbay( def host, def method, def pathUri, Map requestMap )
	{
		try {
			def client = new RESTClient( host )
			client."${method}"( [path:pathUri,query: requestMap] ).data
		} catch ( HttpResponseException ex ) {
			if ( !StringUtils.isEmpty( ex?.response?.data?.error?.toString() ) )
				throw new Exception( ex.response.data.error )
			throw ex
		}
	}
	
	private static def connectEbay( def method, String callName, String level, String req )
	{
		def response = httpClient.request(method, groovyx.net.http.ContentType.XML){
			headers.'X-EBAY-API-COMPATIBILITY-LEVEL' = level
			headers.'X-EBAY-API-DEV-NAME' = getAliasContent("ebay.dev")
			headers.'X-EBAY-API-APP-NAME' = getAliasContent("ebay.app")
			headers.'X-EBAY-API-CERT-NAME' = getAliasContent("cert")
			headers.'X-EBAY-API-SITEID' = '0'
			headers.'X-EBAY-API-CALL-NAME' = callName
			
			body = req
		}
		return response
	}
	
	/**
	 * Trading API
	 * < a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/index.html">here</a>
	 */
	
	/**
	 * AddItem
	 * < a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddItem.html">here</a>
	 */
	static def ebayAddItem(String xmlReq){
		connectEbay(Method.POST,'AddItem','907',xmlReq)
	}
	
	/**
	 * AddItemFromSellingManagerTemplate
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddItemFromSellingManagerTemplate.html">here</a>
	 */
	static def ebayAddItemFromSellingManagerTemplate(String xmlReq){
		connectEbay(Method.POST,'AddItemFromSellingManagerTemplate','607',xmlReq)
	}
	
	/**
	 * AddItemFromSellingManagerTemplate
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddItemFromSellingManagerTemplate.html">here</a>
	 */
	static def ebayAddItems(String xmlReq){
		connectEbay(Method.POST,'AddItems','585',xmlReq)
	}
	
	/**
	 * AddMemberMessageAAQToPartner
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddMemberMessageAAQToPartner.html">here</a>
	 */
	static def ebayAddMemberMessageAAQToPartner(String xmlReq){
		connectEbay(Method.POST,'AddMemberMessageAAQToPartner','907',xmlReq)
	}
	
	/**
	 * AddMemberMessageRTQ
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddMemberMessageRTQ.html">here</a>
	 */
	static def ebayAddMemberMessageRTQ(String xmlReq){
		connectEbay(Method.POST,'AddMemberMessageRTQ','585',xmlReq)
	}
	
	/**
	 * AddMemberMessagesAAQToBidder
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddMemberMessagesAAQToBidder.html">here</a>
	 */
	static def ebayAddMemberMessagesAAQToBidder(String xmlReq){
		connectEbay(Method.POST,'AddMemberMessagesAAQToBidder','907',xmlReq)
	}
	
	/**
	 * AddOrder
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddOrder.html">here</a>
	 */
	static def ebayAddOrder(String xmlReq){
		connectEbay(Method.POST,'AddOrder','907',xmlReq)
	}

	/**
	 * AddSecondChanceItem
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddSecondChanceItem.html">here</a>
	 */
	static def ebayAddSecondChanceItem(String xmlReq){
		connectEbay(Method.POST,'AddSecondChanceItem','907',xmlReq)
	}
	
	
	/**
	 * AddSellingManagerInventoryFolder
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddSellingManagerInventoryFolder.html">here</a>
	 */
	static def ebayAddSellingManagerProduct(String xmlReq){
		connectEbay(Method.POST,'AddSellingManagerProduct','607',xmlReq)
	}
	
	/**
	 * AddSellingManagerTemplate
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddSellingManagerTemplate.html">here</a>
	 */
	static def ebayAddSellingManagerTemplate(String xmlReq){
		connectEbay(Method.POST,'AddSellingManagerTemplate','907',xmlReq)
	}
	
	/**
	 * AddToItemDescription
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddToItemDescription.html">here</a>
	 */
	static def ebayAddToItemDescription(String xmlReq){
		connectEbay(Method.POST,'AddToItemDescription','907',xmlReq)
	}
	
	/**
	 * AddToWatchList
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddToWatchList.html">here</a>
	 */
	static def ebayAddToWatchList(String xmlReq){
		connectEbay(Method.POST,'AddToWatchList','907',xmlReq)
	}
	
	/**
	 * AddTransactionConfirmationItem
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddToWatchList.html">here</a>
	 */
	static def ebayAddTransactionConfirmationItem(String xmlReq){
		connectEbay(Method.POST,'AddTransactionConfirmationItem','907',xmlReq)
	}
	
	/**
	 * CompleteSale
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/CompleteSale.html">here</a>
	 */
	static def ebayCompleteSale(String xmlReq){
		connectEbay(Method.POST,'CompleteSale','907',xmlReq)
	}
	
	/**
	 * ConfirmIdentity
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/ConfirmIdentity.html">here</a>
	 */
	static def ebayConfirmIdentity(String xmlReq){
		connectEbay(Method.POST,'ConfirmIdentity','907',xmlReq)
	}
	
	/**
	 * DeleteMyMessages
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/CompleteSale.html">here</a>
	 */
	static def ebayDeleteMyMessages(String xmlReq){
		connectEbay(Method.POST,'DeleteMyMessages','907',xmlReq)
	}
	
	/**
	 * DeleteSellingManagerInventoryFolder
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/DeleteSellingManagerInventoryFolder.html">here</a>
	 */
	static def ebayDeleteSellingManagerInventoryFolder(String xmlReq){
		connectEbay(Method.POST,'DeleteSellingManagerInventoryFolder','609',xmlReq)
	}
	
	/**
	 * DeleteSellingManagerItemAutomationRule
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/DeleteSellingManagerItemAutomationRule.html">here</a>
	 */
	static def ebayDeleteSellingManagerItemAutomationRule(String xmlReq){
		connectEbay(Method.POST,'DeleteSellingManagerItemAutomationRule','613',xmlReq)
	}

	/**
	 * DeleteSellingManagerProduct
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/DeleteSellingManagerProduct.html">here</a>
	 */
	static def ebayDeleteSellingManagerProduct(String xmlReq){
		connectEbay(Method.POST,'DeleteSellingManagerProduct','607',xmlReq)
	}
	
	/**
	 * DeleteSellingManagerTemplate
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/DeleteSellingManagerTemplate.html">here</a>
	 */
	static def ebayDeleteSellingManagerTemplate(String xmlReq){
		connectEbay(Method.POST,'DeleteSellingManagerTemplate','607',xmlReq)
	}
	
	/**
	 * DeleteSellingManagerTemplateAutomationRule
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/DeleteSellingManagerTemplateAutomationRule.html">here</a>
	 */
	static def ebayDeleteSellingManagerTemplateAutomationRule(String xmlReq){
		connectEbay(Method.POST,'DeleteSellingManagerTemplateAutomationRule','607',xmlReq)
	}
	
	/**
	 * DisableUnpaidItemAssistance
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/DisableUnpaidItemAssistance.html">here</a>
	 */
	static def ebayDisableUnpaidItemAssistance(String xmlReq){
		connectEbay(Method.POST,'DisableUnpaidItemAssistance','583',xmlReq)
	}

	/**
	 * EndFixedPriceItem
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/EndFixedPriceItem.html">here</a>
	 */
	static def ebayEndFixedPriceItem(String xmlReq){
		connectEbay(Method.POST,'EndFixedPriceItem','583',xmlReq)
	}
	
	/**
	 * EndItem
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/EndItem.html">here</a>
	 */
	static def ebayEndItem(String xmlReq){
		connectEbay(Method.POST,'EndItem','583',xmlReq)
	}
	
	/**
	 * EndItems
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/EndItems.html">here</a>
	 */
	static def ebayEndItems(String xmlReq){
		connectEbay(Method.POST,'EndItems','583',xmlReq)
	}
	
	/**
	 * ExtendSiteHostedPictures
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/ExtendSiteHostedPictures.html">here</a>
	 */
	static def ebayExtendSiteHostedPictures(String xmlReq){
		connectEbay(Method.POST,'ExtendSiteHostedPictures','665',xmlReq)
	}
	
	/**
	 * FetchToken
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/FetchToken.html">here</a>
	 */
	static def ebayFetchToken(String xmlReq){
		connectEbay(Method.POST,'FetchToken','665',xmlReq)
	}
	
	/**
	 * GetAccount
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetAccount.html">here</a>
	 */
	static def ebayGetAccount(String xmlReq){
		connectEbay(Method.POST,'GetAccount','665',xmlReq)
	}
	
	/**
	 * GetAdFormatLeads
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetAdFormatLeads.html">here</a>
	 */
	static def ebayGetAdFormatLeads(String xmlReq){
		connectEbay(Method.POST,'GetAdFormatLeads','907',xmlReq)
	}
	
	/**
	 * GetAllBidders
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetAllBidders.html">here</a>
	 */
	static def ebayGetAllBidders(String xmlReq){
		connectEbay(Method.POST,'GetAllBidders','907',xmlReq)
	}
	
	/**
	 * GetApiAccessRules
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetApiAccessRules.html">here</a>
	 */
	static def ebayGetApiAccessRules(String xmlReq){
		connectEbay(Method.POST,'GetApiAccessRules','907',xmlReq)
	}
	
	/**
	 * GetBestOffers
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetBestOffers.html">here</a>
	 */
	static def ebayGetBestOffers(String xmlReq){
		connectEbay(Method.POST,'GetBestOffers','907',xmlReq)
	}
	
	/**
	 * GetBidderList
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetBidderList.html">here</a>
	 */
	static def ebayGetBidderList(String xmlReq){
		connectEbay(Method.POST,'GetBidderList','907',xmlReq)
	}
	
	/**
	 * GetCategories
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetCategories.html">here</a>
	 */
	static def ebayGetCategories(String xmlReq){
		connectEbay(Method.POST,'GetCategories','907',xmlReq)
	}
	
	/**
	 * GetCategory2CS
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetCategory2CS.html">here</a>
	 */
	static def ebayGetCategory2CS(String xmlReq){
		connectEbay(Method.POST,'GetCategory2CS','907',xmlReq)
	}
	
	/**
	 * GetCategoryFeatures
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetCategoryFeatures.html">here</a>
	 */
	static def ebayGetCategoryFeatures(String xmlReq){
		connectEbay(Method.POST,'GetCategoryFeatures','907',xmlReq)
	}
	
	/**
	 * GetCategoryMappings
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetCategoryMappings.html">here</a>
	 */
	static def ebayGetCategoryMappings(String xmlReq){
		connectEbay(Method.POST,'GetCategoryMappings','907',xmlReq)
	}
	
	/**
	 * GetCategorySpecifics
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetCategorySpecifics.html">here</a>
	 */
	static def ebayGetCategorySpecifics(String xmlReq){
		connectEbay(Method.POST,'GetCategorySpecifics','611',xmlReq)
	}
	
	/**
	 * GetChallengeToken
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetChallengeToken.html">here</a>
	 */
	static def ebayGetChallengeToken(String xmlReq){
		connectEbay(Method.POST,'GetChallengeToken','907',xmlReq)
	}
	
	/**
	 * GetCharities
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetCharities.html">here</a>
	 */
	static def ebayGetCharities(String xmlReq){
		connectEbay(Method.POST,'GetCharities','907',xmlReq)
	}
	
	/**
	 * GetClientAlertsAuthToken
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetClientAlertsAuthToken.html">here</a>
	 */
	static def ebayGetClientAlertsAuthToken(String xmlReq){
		connectEbay(Method.POST,'GetClientAlertsAuthToken','907',xmlReq)
	}
	
	/**
	 * GetContextualKeywords
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetContextualKeywords.html">here</a>
	 */
	static def ebayGetContextualKeywords(String xmlReq){
		connectEbay(Method.POST,'GetContextualKeywords','907',xmlReq)
	}
	
	/**
	 * GetCrossPromotions
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetCrossPromotions.html">here</a>
	 */
	static def ebayGetCrossPromotions(String xmlReq){
		connectEbay(Method.POST,'GetCrossPromotions','907',xmlReq)
	}
	
	/**
	 * GetDescriptionTemplates
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetDescriptionTemplates.html">here</a>
	 */
	static def ebayGetDescriptionTemplates(String xmlReq){
		connectEbay(Method.POST,'GetDescriptionTemplates','907',xmlReq)
	}
	
	/**
	 * GetDisputes
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetDisputes.html">here</a>
	 */
	static def ebayGetDispute(String xmlReq){
		connectEbay(Method.POST,'GetDispute','907',xmlReq)
	}

	/**
	 * GeteBayDetails
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GeteBayDetails.html">here</a>
	 */
	static def ebayGeteBayDetails(String xmlReq){
		connectEbay(Method.POST,'GeteBayDetails','907',xmlReq)
	}
	
	/**
	 * GetFeedback
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetFeedback.html">here</a>
	 */
	static def ebayGetFeedback(String xmlReq){
		connectEbay(Method.POST,'GetFeedback','907',xmlReq)
	}
	
	/**
	 * GetItem
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetItem.html">here</a>
	 */
	static def ebayGetItem(String xmlReq){
		connectEbay(Method.POST,'GetItem','907',xmlReq)
	}
	
	
		
	/**
	 * GeteBayOfficialTime
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GeteBayOfficialTime.html">here</a> 
	 */
	static def ebayGeteBayOfficialTime(String xmlReq){
		connectEbay(Method.POST,'GeteBayOfficialTime','907',xmlReq)
	}
	
	/**
	 * GetItemsAwaitingFeedback
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetItemsAwaitingFeedback.html">here</a>
	 */
	static def ebayGetItemsAwaitingFeedback(String xmlReq){
		connectEbay(Method.POST,'GetItemsAwaitingFeedback','907',xmlReq)
	}
	
	/**
	 * GetItemShipping
	 * <a href="http://developer.ebay.com/Devzone/XML/docs/Reference/eBay/GetItemShipping.html">here</a>
	 */
	static def ebayGetItemShipping(String xmlReq){
		connectEbay(Method.POST,'GetItemShipping','907',xmlReq)
	}
	
	
	
	
	/**
	 * Finding Api
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/index.html">here</a>
	 */
	
	/**
	 * findCompletedItems
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/findCompletedItems.html">here</a>
	 */
	static def ebayFindCompletedItems(String key, String keyword){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/services/search/FindingService/v1',
						['OPERATION-NAME':'findCompletedItems','SECURITY-APPNAME':getAliasContent("ebay.${key}"),keywords:keyword, 'RESPONSE-DATA-FORMAT':'JSON', 'paginationInput.entriesPerPage':'2'] )
	}
	
	/**
	 * findItemsAdvanced
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/findItemsAdvanced.html">here</a>
	 */
	static def ebayFindItemsAdvanced(String key,String keyword){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/services/search/FindingService/v1',
						['OPERATION-NAME':'findItemsAdvanced','SECURITY-APPNAME':getAliasContent("ebay.${key}"),keywords:keyword, 'RESPONSE-DATA-FORMAT':'JSON', 'paginationInput.entriesPerPage':'2'] )
	}
	
	/**
	 * findItemsByCategory
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/findItemsByImage.html">here</a>
	 */
	static def ebayFindItemsByCategory(String key,String category){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/services/search/FindingService/v1',
						['OPERATION-NAME':'findItemsByCategory','SECURITY-APPNAME':getAliasContent("ebay.${key}"),categoryId:category, 'RESPONSE-DATA-FORMAT':'JSON', 'paginationInput.entriesPerPage':'2'] )
	}
	
	/**
	 * findItemsByImage
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/findItemsByCategory.html">here</a>
	 */
	static def ebayFindItemsByImage(String key,String itemID){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/services/search/FindingService/v1',
						['OPERATION-NAME':'findItemsByImage','SECURITY-APPNAME':getAliasContent("ebay.${key}"),itemId:itemID, 'RESPONSE-DATA-FORMAT':'XML', 'paginationInput.entriesPerPage':'2'] )
	}
	
	/**
	 * findItemsByKeywords
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/findItemsByKeywords.html">here</a>
	 */
	static def ebayFindItemsByKeywords(String key,String keyword){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/services/search/FindingService/v1',
						['OPERATION-NAME':'findItemsByKeywords','SECURITY-APPNAME':getAliasContent("ebay.${key}"),keywords:keyword, 'RESPONSE-DATA-FORMAT':'JSON', 'paginationInput.entriesPerPage':'2'] )
	}
	
	/**
	 * findItemsByProduct
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/findItemsByProduct.html">here</a>
	 */
	static def ebayFindItemsByProduct(String key,String prodID){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/services/search/FindingService/v1',
						['OPERATION-NAME':'findItemsByProduct','SECURITY-APPNAME':getAliasContent("ebay.${key}"),'productId.@type':'ReferenceID',productId:prodID, 'RESPONSE-DATA-FORMAT':'JSON', 'paginationInput.entriesPerPage':'2'] )
	}
	
	/**
	 * findItemsIneBayStores
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/findItemsIneBayStores.html">here</a>
	 */
	static def ebayFindItemsIneBayStores(String key,String keyword){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/services/search/FindingService/v1',
						['OPERATION-NAME':'findItemsIneBayStores','SECURITY-APPNAME':getAliasContent("ebay.${key}"),'productId.@type':'ReferenceID',keywords:keyword, 'RESPONSE-DATA-FORMAT':'JSON', 'paginationInput.entriesPerPage':'2'] )
	}
	
	/**
	 * getHistograms
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/getHistograms.html">here</a>
	 */
	static def ebayGetHistograms(String key,String categoryID){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/services/search/FindingService/v1',
						['OPERATION-NAME':'getHistograms','SECURITY-APPNAME':getAliasContent("ebay.${key}"),'productId.@type':'ReferenceID',categoryId:categoryID, 'RESPONSE-DATA-FORMAT':'JSON', 'paginationInput.entriesPerPage':'2'] )
	}
	
	/**
	 * getSearchKeywordsRecommendation
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/getSearchKeywordsRecommendation.html">here</a>
	 */
	static def ebayGetSearchKeywordsRecommendation(String key,String keyword){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/services/search/FindingService/v1',
						['OPERATION-NAME':'getSearchKeywordsRecommendation','SECURITY-APPNAME':getAliasContent("ebay.${key}"),'productId.@type':'ReferenceID',keywords:keyword, 'RESPONSE-DATA-FORMAT':'JSON', 'paginationInput.entriesPerPage':'2'] )
	}
	
	/**
	 * getVersion
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/getSearchKeywordsRecommendation.html">here</a>
	 */
	static def ebayGetVersion(String key){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/services/search/FindingService/v1',
						['OPERATION-NAME':'getVersion','SECURITY-APPNAME':getAliasContent("ebay.${key}"),'productId.@type':'ReferenceID','RESPONSE-DATA-FORMAT':'JSON', 'paginationInput.entriesPerPage':'2'] )
	}
	
	
	
	/**
	 * Merchandising API
	 * < a href = "http://developer.ebay.com/Devzone/merchandising/docs/CallRef/index.html">here</a>
	 */
	
	/**
	 * getMostWatchedItems
	 * <a href="http://developer.ebay.com/Devzone/finding/CallRef/getSearchKeywordsRecommendation.html">here</a>
	 */
	static def ebayGetMostWatchedItems(String key){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/MerchandisingService',
						['OPERATION-NAME':'getMostWatchedItems','SERVICE-NAME':'MerchandisingService','CONSUMER-ID':getAliasContent("ebay.${key}"),'RESPONSE-DATA-FORMAT':'JSON', 'maxResults':'2'] )
	}
	
	/**
	 * getRelatedCategoryItems
	 * <a href="http://developer.ebay.com/Devzone/merchandising/docs/CallRef/getRelatedCategoryItems.html">here</a>
	 */
	static def ebayGetRelatedCategoryItems(String key,String itemID){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/MerchandisingService',
						['OPERATION-NAME':'getRelatedCategoryItems','SERVICE-NAME':'MerchandisingService','CONSUMER-ID':getAliasContent("ebay.${key}"),'RESPONSE-DATA-FORMAT':'JSON', 'maxResults':'2', itemId:itemID] )
	}
	
	/**
	 * getSimilarItems
	 * <a href="http://developer.ebay.com/Devzone/merchandising/docs/CallRef/getRelatedCategoryItems.html">here</a>
	 */
	static def ebayGetSimilarItems(String key,String itemID){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/MerchandisingService',
						['OPERATION-NAME':'getSimilarItems','SERVICE-NAME':'MerchandisingService','CONSUMER-ID':getAliasContent("ebay.${key}"),'RESPONSE-DATA-FORMAT':'JSON', itemId:itemID, 'maxResults':'2'] )
	}
	
	/**
	 * getTopSellingProducts
	 * <a href="http://developer.ebay.com/Devzone/merchandising/docs/CallRef/getRelatedCategoryItems.html">here</a>
	 */
	static def ebayGetTopSellingProducts(String key){
		contactEbay( 'http://svcs.sandbox.ebay.com', 'get' ,'/MerchandisingService',
						['OPERATION-NAME':'getTopSellingProducts','SERVICE-NAME':'MerchandisingService','CONSUMER-ID':getAliasContent("ebay.${key}"),'RESPONSE-DATA-FORMAT':'JSON', 'maxResults':'2'] )
	}
	
	
		
	/**
	 * Shopping API
	 *  <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/index.html">here</a>
	 */
	
	/**
	 * FindHalfProducts
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/FindHalfProducts.html">here</a>
	 */
	static def ebayFindHalfProducts(String key,String keyword){
		contactEbay( 'http://open.api.sandbox.ebay.com', 'get' ,'/shopping',
						[callname:'FindHalfProducts',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),version:527,QueryKeywords:keyword,MaxEntries:2] )
	}

	/**
	 * FindPopularItems
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/FindHalfProducts.html">here</a>
	 */
	static def ebayFindPopularItems(String key,String keyword){
		contactEbay( 'http://open.api.sandbox.ebay.com', 'get' ,'/shopping',
						[callname:'FindPopularItems',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),siteId:0,version:531,QueryKeywords:keyword,MaxEntries:2] )
	}
	
	/**
	 * FindPopularSearches
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/FindPopularSearches.html">here</a>
	 */
	static def ebayFindPopularSearches(String key,String keyword){
		contactEbay( 'http://open.api.sandbox.ebay.com', 'get' ,'/shopping',
						[callname:'FindPopularSearches',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),siteId:0,version:531,QueryKeywords:keyword,MaxEntries:2] )
	}
	
	/**
	 * FindReviewsAndGuides
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/FindReviewsAndGuides.html">here</a>
	 */
	static def ebayFindReviewsAndGuides(String key,String categoryID){
		contactEbay( 'http://open.api.ebay.com', 'get' ,'/shopping',
						[callname:'FindReviewsAndGuides',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),siteId:0,version:531,CategoryID:categoryID] )
	}
	
	/**
	 * GetCategoryInfo
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/GetCategoryInfo.html">here</a>
	 */
	static def ebayGetCategoryInfo(String key,String categoryID){
		contactEbay( 'http://open.api.sandbox.ebay.com', 'get' ,'/shopping',
						[callname:'GetCategoryInfo',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),siteId:0,version:677,CategoryID:categoryID] )
	}
	
	/**
	 * GeteBayTime
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/GetCategoryInfo.html">here</a>
	 */
	static def ebayGeteBayTime(String key){
		contactEbay( 'http://open.api.sandbox.ebay.com', 'get' ,'/shopping',
						[callname:'GeteBayTime',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),siteId:0,version:533] )
	}
	
	/**
	 * GetItemStatus
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/GetItemStatus.html">here</a>
	 */
	static def ebayGetItemStatus(String key,String itemID){
		contactEbay( 'http://open.api.sandbox.ebay.com', 'get' ,'/shopping',
						[callname:'GetItemStatus',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),siteId:0,version:525,ItemID:itemID] )
	}
	
	/**
	 * GetMultipleItems
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/GetMultipleItems.html">here</a>
	 */
	static def ebayGetMultipleItems(String key,String itemID){
		contactEbay( 'http://open.api.sandbox.ebay.com', 'get' ,'/shopping',
						[callname:'GetMultipleItems',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),siteId:0,version:525,ItemID:itemID] )
	}
	
	/**
	 * GetShippingCosts
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/GetShippingCosts.html">here</a>
	 */
	static def ebayGetShippingCosts(String key,String itemID, String destination, String postalcode){
		contactEbay( 'http://open.api.sandbox.ebay.com', 'get' ,'/shopping',
						[callname:'GetShippingCosts',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),siteId:0,version:517,ItemID:itemID,DestinationCountryCode:destination,DestinationPostalCode:postalcode,IncludeDetails:true,QuantitySold:1] )
	}
	
	/**
	 * GetSingleItem
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/GetSingleItem.html">here</a>
	 */
	static def ebayGetSingleItem(String key,String itemID){
		contactEbay( 'http://open.api.sandbox.ebay.com', 'get' ,'/shopping',
						[callname:'GetSingleItem',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),siteId:0,version:517,ItemID:itemID] )
	}
	
	/**
	 * GetUserProfile
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/GetUserProfile.html">here</a>
	 */
	static def ebayGetUserProfile(String key,String userID){
		contactEbay( 'http://open.api.ebay.com', 'get' ,'/shopping',
						[callname:'GetUserProfile',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),siteId:0,version:525,UserID:userID] )
	}
	
	/**
	 * Finding API
	 * < a href="http://developer.ebay.com/Devzone/finding/CallRef/index.html">here</a>
	 */
	
	/**
	 * FindCompletedItems
	 * <a href="http://developer.ebay.com/Devzone/shopping/docs/CallRef/GetUserProfile.html">here</a>
	 */
//	static def ebayFindCompletedItems(String key, String){
//		contactEbay( 'http://open.api.ebay.com', 'get' ,'/shopping',
//			[callname:'GetUserProfile',responseencoding:'JSON',appid:getAliasContent("ebay.${key}"),siteId:0,version:525,UserID:userID] )
//	}
	
//	http://open.api.ebay.com/shopping?
//	callname=FindHalfProducts&
//	responseencoding=XML&
//	appid=ralenman-573d-4697-9448-472baf923e67&
//	version=527&
//	QueryKeywords=harry%20potter&
//	MaxEntries=2
	
	//<=== E N D ===>
}
