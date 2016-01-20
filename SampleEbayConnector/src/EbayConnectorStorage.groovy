
import java.util.Map;

class EbayConnectorStorage {
	
	private static Map apiKeyMap = [ : ]
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
	
	static def addItemXML(String alias, String title, String desc, String catID,
			String startPrice, String country, String currency, String paypalMail,
			String urlPic, String postal, String quantity) {
		return '''<?xml version="1.0" encoding="utf-8"?>
<AddItemRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <ErrorLanguage>en_US</ErrorLanguage>
  <WarningLevel>High</WarningLevel>
  <Item>
    <Title>'''+title+'''</Title>
    <Description>'''+desc+'''</Description>
    <PrimaryCategory>
      <CategoryID>'''+catID+'''</CategoryID>
    </PrimaryCategory>
    <StartPrice>'''+startPrice+'''</StartPrice>
    <CategoryMappingAllowed>true</CategoryMappingAllowed>
    <ConditionID>4000</ConditionID>
    <Country>'''+country+'''</Country>
    <Currency>'''+currency+'''</Currency>
    <DispatchTimeMax>3</DispatchTimeMax>
    <ListingDuration>Days_7</ListingDuration>
    <ListingType>FixedPriceItem</ListingType>
    <PaymentMethods>PayPal</PaymentMethods>
    <PayPalEmailAddress>'''+paypalMail+'''</PayPalEmailAddress>
    <PictureDetails>
      <PictureURL>'''+urlPic+'''</PictureURL>
    </PictureDetails>
    <PostalCode>'''+postal+'''</PostalCode>
    <Quantity>'''+quantity+'''</Quantity>
    <ReturnPolicy>
      <ReturnsAcceptedOption>ReturnsAccepted</ReturnsAcceptedOption>
      <RefundOption>MoneyBack</RefundOption>
      <ReturnsWithinOption>Days_30</ReturnsWithinOption>
      <Description>If not satisfied, return for refund.</Description>
      <ShippingCostPaidByOption>Buyer</ShippingCostPaidByOption>
    </ReturnPolicy>
    <ShippingDetails>
      <ShippingType>Flat</ShippingType>
      <ShippingServiceOptions>
        <ShippingServicePriority>1</ShippingServicePriority>
        <ShippingService>USPSMedia</ShippingService>
        <ShippingServiceCost>50</ShippingServiceCost>
      </ShippingServiceOptions>
    </ShippingDetails>
    <Site>US</Site>
  </Item>
</AddItemRequest>'''
	}
	
	static def addItemFromSellingManagerTemplateXML(String alias){
		return'''<?xml version="1.0" encoding="utf-8"?>
			<AddItemFromSellingManagerTemplateRequest xmlns="urn:ebay:apis:eBLBaseComponents">
				<RequesterCredentials>
					<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
				</RequesterCredentials>
					<Version>607</Version>
					<SaleTemplateID>6014012013</SaleTemplateID>
			</AddItemFromSellingManagerTemplateRequest>'''
	}
	
	static def addMemberMessageAAQToPartnerXML(String alias, String itemID, String recipientID){
		return '''<?xml version="1.0" encoding="utf-8"?>
<AddMemberMessageAAQToPartnerRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <ItemID>'''+itemID+'''</ItemID>
  <MemberMessage>
    <Subject>Thank You for your purchase</Subject>
    <Body>We appreciate your business and hope you enjoy your product.</Body>
    <QuestionType>General</QuestionType>
    <RecipientID>'''+recipientID+'''</RecipientID>
  </MemberMessage>
</AddMemberMessageAAQToPartnerRequest>'''
	}
	
	static def addMemberMessageRTQXML(String alias, String itemID, String message, String recipientID, String parentMessage)
	{
		return ''' <?xml version="1.0" encoding="utf-8"?>
<AddMemberMessageRTQRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <ItemID>'''+itemID+'''</ItemID>
  <MemberMessage>
    <Body>
      '''+message+'''
    </Body>
    <DisplayToPublic>true</DisplayToPublic>
    <EmailCopyToSender>true</EmailCopyToSender>
    <ParentMessageID>'''+parentMessage+'''</ParentMessageID>
    <RecipientID>'''+recipientID+'''</RecipientID>
  </MemberMessage>
</AddMemberMessageRTQRequest>
 '''
	}
	
	static def addMemberMessagesAAQToBidderXML(String alias, String itemID, String message, String recipient)
	{
		return ''' <?xml version="1.0" encoding="utf-8"?>
<AddMemberMessagesAAQToBidderRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <AddMemberMessagesAAQToBidderRequestContainer>
    <CorrelationID>1</CorrelationID>
    <ItemID>'''+itemID+'''</ItemID>
    <MemberMessage>
      <Body>
        '''+message+'''
      </Body>
      <RecipientID>'''+message+'''</RecipientID>
    </MemberMessage>
  </AddMemberMessagesAAQToBidderRequestContainer>'''
	}
	
	static def addOrderXML(String alias, String currency, String total, String itemID1, String transID1, String itemID2, String transID2){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<AddOrderRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <Order>
    <CreatingUserRole>Seller</CreatingUserRole>
    <PaymentMethods>PayPal</PaymentMethods>
    <Total currencyID="'''+currency+'''">'''+total+'''</Total>
    <TransactionArray>
      <Transaction>
        <Item>
          <ItemID>'''+itemID1+'''</ItemID>
        </Item>
        <TransactionID>'''+transID1+'''</TransactionID>
      </Transaction>
		<Transaction>
        <Item>
          <ItemID>'''+itemID2+'''</ItemID>
        </Item>
        <TransactionID>'''+transID2+'''</TransactionID>
      </Transaction>
    </TransactionArray>
  </Order>
</AddOrderRequest> '''
	}
	
	static def addSecondChanceItemXML(String alias, String bidder, String itemID,String message)
	{
		return ''' <?xml version="1.0" encoding="utf-8"?>
<AddSecondChanceItemRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <RecipientBidderUserID>'''+bidder+'''</RecipientBidderUserID>
  <Duration>Days_3</Duration>
  <ItemID>'''+itemID+'''</ItemID>
  <SellerMessage>
   '''+message+'''
  </SellerMessage>
</AddSecondChanceItemRequest> '''
	}
	
	static def addSellingManagerInventoryFolderXML(String alias, String parentID, String folderName, String comment){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<AddSellingManagerInventoryFolderRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <WarningLevel>high</WarningLevel>
  <Version>607</Version>
  <ParentFolderID>'''+parentID+'''</ParentFolderID>
  <FolderName>'''+folderName+'''</FolderName>
  <Comment>'''+comment+'''</Comment>
</AddSellingManagerInventoryFolderRequest> '''
	}
	
	static def addSellingManagerProductXML(String alias, String prodName,  String quantity, String folderID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<AddSellingManagerProductRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <Version>607</Version>
  <RequesterCredentials>
      <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <SellingManagerProductDetails>
    <ProductName>'''+prodName+'''</ProductName>
    <QuantityAvailable>'''+quantity+'''</QuantityAvailable>
    <FolderID>'''+folderID+'''</FolderID>
  </SellingManagerProductDetails>
</AddSellingManagerProductRequest> '''
	}
	
	static def addSellingManagerTemplateXML(String alias){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<AddSellingManagerTemplateRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
      <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <ErrorHandling>BestEffort</ErrorHandling>
  <Version>607</Version>
  <ErrorLanguage>en_US</ErrorLanguage>
  <WarningLevel>High</WarningLevel>
  <Item>
    <PostalCode>95125</PostalCode>
    <PrimaryCategory>
      <CategoryID>37905</CategoryID>
    </PrimaryCategory>
    <Country>US</Country>
    <Currency>USD</Currency>
    <Description>New book: Harry Potter and the Prisoner of Azkaban
    </Description>
    <DispatchTimeMax>1</DispatchTimeMax>
    <ListingDuration>Days_7</ListingDuration>
    <GiftIcon>0</GiftIcon>
    <PaymentMethods>PayPal</PaymentMethods>
    <PayPalEmailAddress>PayPalEmail@ISP.net</PayPalEmailAddress>
    <PaymentMethods>VisaMC</PaymentMethods>
    <PrivateListing>0</PrivateListing>
    <Quantity>1</Quantity>
    <StartPrice currencyID="USD">15.00</StartPrice>
    <Storefront>
      <StoreCategoryID>1</StoreCategoryID>
    </Storefront>
    <Title>Harry Potter and the Prisoner of Azkaban</Title>
    <ListingType>FixedPriceItem</ListingType>
    <AttributeSetArray>
      <AttributeSet attributeSetID="2135" attributeSetVersion="54595">
        <Attribute attributeID="3806">
          <Value>
          </Value>
        </Attribute>
      </AttributeSet>
    </AttributeSetArray>
    <CategoryMappingAllowed>1</CategoryMappingAllowed>
    <CategoryBasedAttributesPrefill>1</CategoryBasedAttributesPrefill>
    <ShippingDetails>
      <ShippingType>Flat</ShippingType>
      <ShippingServiceOptions>
        <ShippingServicePriority>1</ShippingServicePriority>
        <ShippingService>UPS2ndDay</ShippingService>
        <ShippingServiceCost>5</ShippingServiceCost>
        <ShippingServiceAdditionalCost>1</ShippingServiceAdditionalCost>
        <ShippingSurcharge>1</ShippingSurcharge>
      </ShippingServiceOptions>
    </ShippingDetails>
    <ReturnPolicy>
      <Description>If it is not in great shape, return it</Description>
      <ReturnsAcceptedOption>ReturnsAccepted</ReturnsAcceptedOption>
    </ReturnPolicy>
  </Item>
  <ProductID>5001162334</ProductID>
</AddSellingManagerTemplateRequest> '''
	}
	
	static def addToItemDescriptionXML(String alias, String itemID, String desc){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<AddToItemDescriptionRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <ItemID>'''+itemID+'''</ItemID>
  <Description>
    '''+desc+'''
  </Description>
</AddToItemDescriptionRequest>
 '''
	}
	
	static def addToWatchListXML(String alias, String itemID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<AddToWatchListRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <WarningLevel>High</WarningLevel>
  <ItemID>'''+itemID+'''</ItemID>
</AddToWatchListRequest> '''
	}
	
	static def addTransactionConfirmationItemXML(String alias, String recipientID, String postalCode, String price, String itemID, String comments){
		return ''' <?xml version="1.0" encoding="utf-8"?> 
<AddTransactionConfirmationItemRequest xmlns="urn:ebay:apis:eBLBaseComponents"> 
  <RequesterCredentials> 
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials> 
  <RecipientUserID>'''+recipientID+'''</RecipientUserID> 
  <VerifyEligibilityOnly>false</VerifyEligibilityOnly> 
  <RecipientPostalCode>''' +postalCode+ '''</RecipientPostalCode> 
  <RecipientRelationType>4</RecipientRelationType> 
  <NegotiatedPrice>'''+price+'''</NegotiatedPrice> 
  <ListingDuration>Days_3</ListingDuration> 
  <ItemID>'''+itemID+'''</ItemID> 
  <Comments>'''+comments+'''</Comments> 
</AddTransactionConfirmationItemRequest>
 '''
	}
	
	static def completeSaleXML(String alias, String comment, String commentType, String targetUser,
			String itemID, String paymentCond, String note, String shippingCond, String transID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<CompleteSaleRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <WarningLevel>High</WarningLevel>
  <FeedbackInfo>
    <CommentText>'''+comment+'''</CommentText>
    <CommentType>'''+commentType+'''</CommentType>
    <TargetUser>'''+targetUser+'''</TargetUser>
  </FeedbackInfo>
  <ItemID>'''+itemID+'''</ItemID>
  <Paid>'''+paymentCond+'''</Paid>
  <Shipment>
    <Notes>'''+note+'''</Notes>
  </Shipment>
  <Shipped>'''+shippingCond+'''</Shipped>
  <TransactionID>'''+transID+'''</TransactionID>
</CompleteSaleRequest> '''
	}
	
	static def confirmIdentityXML(String alias, String sessionID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
		<ConfirmIdentityRequest xmlns="urn:ebay:apis:eBLBaseComponents">
			<RequesterCredentials>
				<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
			</RequesterCredentials>
			<SessionID>'''+sessionID+'''</SessionID>
  		</ConfirmIdentityRequest> '''
	}
	
	static def deleteMyMessagesXML(String alias, String messageID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
				<DeleteMyMessagesRequest xmlns="urn:ebay:apis:eBLBaseComponents">
				<RequesterCredentials>
					<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
				</RequesterCredentials>
				<MessageIDs>
    				<MessageID>'''+messageID+'''</MessageID>
			 	</MessageIDs>
			 	</DeleteMyMessagesRequest> '''
	}
	
	static def deleteSellingManagerInventoryFolderXML(String alias, String folderID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<DeleteSellingManagerInventoryFolderRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <Version>609</Version>
  <FolderID>'''+folderID+'''</FolderID>
</DeleteSellingManagerInventoryFolderRequest> '''
	}
	
	static def deleteSellingManagerItemAutomationRuleXML(String alias, String itemID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<DeleteSellingManagerItemAutomationRuleRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <Version>613</Version>
  <RequesterCredentials>
      <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <ItemID>'''+itemID+'''</ItemID>
  <DeleteAutomatedRelistingRule>true</DeleteAutomatedRelistingRule>
</DeleteSellingManagerItemAutomationRuleRequest> '''
	}
	
	static def deleteSellingManagerProductXML(String alias, String prodID){
		return ''' ?xml version="1.0" encoding="utf-8"?>
<DeleteSellingManagerProductRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <Version>607</Version>
  <ProductID>'''+prodID+'''</ProductID>
</DeleteSellingManagerProductRequest> '''
	}
	
	static def deleteSellingManagerTemplateXML(String alias, String templateID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<DeleteSellingManagerTemplateRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>    
		<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <Version>607</Version>
  <SaleTemplateID>'''+templateID+'''</SaleTemplateID>
</DeleteSellingManagerTemplateRequest> '''
	}
	
	static def DeleteSellingManagerTemplateAutomationRuleXML( String alias, String templateID ){
		return ''' <?xml version="1.0" encoding="utf-8"?>
	<DeleteSellingManagerTemplateAutomationRuleRequest xmlns="urn:ebay:apis:eBLBaseComponents">
	  <Version>607</Version>
	  <RequesterCredentials>
			<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
	  </RequesterCredentials>
	  <SaleTemplateID>''' +templateID+ '''</SaleTemplateID>
	  <DeleteAutomatedListingRule>true</DeleteAutomatedListingRule>
	</DeleteSellingManagerTemplateAutomationRuleRequest> '''
	}
	
	static def disableUnpaidItemAssistanceXML(String alias, String itemID, String transactionID){
		return ''' <?xml version="1.0" encoding="UTF-8"?>
<DisableUnpaidItemAssistanceRequest xmlns="urn:ebay:apis:eBLBaseComponents">
<RequesterCredentials>
			<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
	   </RequesterCredentials>  
		<ErrorLanguage>en_US</ErrorLanguage>
		<WarningLevel>High</WarningLevel>
		<Version>583</Version>
		<ItemID>'''+itemID+'''</ItemID>
		<TransactionID>'''+ transactionID +'''</TransactionID>
</DisableUnpaidItemAssistanceRequest> '''
	}
	
	static def endFixedPriceItemXML(String alias, String itemID, String endingReason){
		return ''' <?<?xml version="1.0" encoding="utf-8"?>
<EndFixedPriceItemRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <ItemID>'''+itemID+'''</ItemID>
  <EndingReason>'''+endingReason+'''</EndingReason>
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
</EndFixedPriceItemRequest> '''
	}
	
	static def endItemXML(String alias, String itemID, String reason){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<EndItemRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <ItemID>''' +itemID+ '''</ItemID>
  <EndingReason>''' +reason+ '''</EndingReason>
</EndItemRequest> '''
	}
	
	static def endItemsXML(String alias, String itemID, String reason, String itemID2, String reason2){
		return ''' <?xml version="1.0" encoding="utf-8" ?>
<EndItemsRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <EndItemRequestContainer>
    <MessageID>1</MessageID>
    <EndingReason>'''+reason+'''</EndingReason>
    <ItemID>'''+itemID+'''</ItemID>
  </EndItemRequestContainer>
  <EndItemRequestContainer>
    <MessageID>2</MessageID>
    <EndingReason>'''+reason2+'''</EndingReason>
    <ItemID>''' +itemID2+ '''</ItemID>
  </EndItemRequestContainer>
</EndItemsRequest> '''
	}
	
	static def  extendSiteHostedPicturesXML(String alias, String photoURL, String extDays){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<ExtendSiteHostedPicturesRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <ErrorLanguage>en_US</ErrorLanguage>
  <WarningLevel>High</WarningLevel>
  <Version>665</Version>
  <ExtensionInDays>'''+extDays+'''</ExtensionInDays>
  <PictureURL>'''+photoURL+ '''</PictureURL>
</ExtendSiteHostedPicturesRequest>
 '''
	}
	
	static def fetchTokenXML(String sessionID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<FetchTokenRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <SessionID>'''+sessionID+'''</SessionID>
</FetchTokenRequest> '''
	}
	
	static def getAccountXML(String alias){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetAccountRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <AccountEntrySortType>AccountEntryFeeTypeAscending</AccountEntrySortType>
  <AccountHistorySelection>LastInvoice</AccountHistorySelection>
</GetAccountRequest> '''
	}
	
	static def getAdFormatLeadsXML(String alias, String itemID){
		return ''' <?xml version="1.0" encoding="utf-8"?> 
<GetAdFormatLeadsRequest xmlns="urn:ebay:apis:eBLBaseComponents"> 
  <RequesterCredentials> 
     <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials> 
  <ItemID>'''+itemID+'''</ItemID> 
  <DetailLevel>ReturnAll</DetailLevel> 
</GetAdFormatLeadsRequest>  '''
	}
	
	
	static def GetAllBiddersXML(String alias, String itemID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetAllBiddersRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <ItemID>'''+itemID+'''</ItemID>
<CallMode EnumType="GetAllBiddersModeCodeType">ViewAll</CallMode>
</GetAllBiddersRequest> '''
	}
	
	static def getApiAccessRulesXML(String alias){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetApiAccessRulesRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
</GetApiAccessRulesRequest> '''
	}
	
	static def getBestOffersXML(String alias){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetBestOffersRequest xmlns="urn:ebay:apis:eBLBaseComponents">
<RequesterCredentials>
<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
</RequesterCredentials>
</GetBestOffersRequest>​ '''
	}
	
	static def getBidderListXML(String alias)
	{
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetBidderListRequest xmlns="urn:ebay:apis:eBLBaseComponents">
<RequesterCredentials>
<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
</RequesterCredentials>
</GetBidderListRequest>​ '''
	}
	
	static def getCategoriesXML(String alias)
	{
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetCategoriesRequest xmlns="urn:ebay:apis:eBLBaseComponents">
<RequesterCredentials>
<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
</RequesterCredentials>
</GetCategoriesRequest>​ '''
	}
	
	static def getCategory2CSXML(String alias, String categoryID)
	{
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetCategory2CSRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <CategoryID>'''+categoryID+'''</CategoryID>
  <DetailLevel>ReturnAll</DetailLevel>
</GetCategory2CSRequest>​ '''
	}
	
	static def getCategoryFeaturesXML(String alias, String categoryID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetCategoryFeaturesRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
   <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <CategoryID>'''+categoryID+'''</CategoryID>
  <DetailLevel>ReturnAll</DetailLevel>
  <ViewAllNodes>true</ViewAllNodes>
</GetCategoryFeaturesRequest> '''
	}
	
	static def getCategoryMappingsXML(String alias, String categoryVersion){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetCategoryMappingsRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <WarningLevel>High</WarningLevel>
  <DetailLevel>ReturnAll</DetailLevel>
  <CategoryVersion>'''+categoryVersion+'''</CategoryVersion>
</GetCategoryMappingsRequest> '''
	}
	
	static def getCategorySpecificsXML(String alias, String categoryID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetCategorySpecificsRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <CategorySpecific>
    <CategoryID>'''+categoryID+'''</CategoryID>
  </CategorySpecific>
  <RequesterCredentials>
  <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
</GetCategorySpecificsRequest>​ '''
	}
	
	static def getChallengeTokenXML(String alias){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetChallengeTokenRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <WarningLevel>High</WarningLevel>
</GetChallengeTokenRequest> '''
	}
	
	static def getCharitiesXML(String alias){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetCharitiesRequest xmlns="urn:ebay:apis:eBLBaseComponents">
<RequesterCredentials>
<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
</RequesterCredentials>
</GetCharitiesRequest>​ '''
	}
	
	static def getClientAlertsAuthTokenXML(String alias){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetClientAlertsAuthTokenRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <ErrorLanguage>en_US</ErrorLanguage>
  <WarningLevel>High</WarningLevel>
</GetClientAlertsAuthTokenRequest> '''
	}
	
	static def getContextualKeywordsXML(String alias, String url){
		return ''' <?xml version="1.0" encoding="utf-8"?> 
<GetContextualKeywordsRequest xmlns="urn:ebay:apis:eBLBaseComponents"> 
  <RequesterCredentials> 
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials> 
  <URL>'''+url+'''</URL> 
  <Encoding>ISO-8859-1</Encoding> 
</GetContextualKeywordsRequest> '''
	}
	
	static def getCrossPromotionsXML(String alias, String itemID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetCrossPromotionsRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
   <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <PromotionMethod>UpSell</PromotionMethod>
  <ItemID>'''+itemID+'''</ItemID>
</GetCrossPromotionsRequest>
 '''
	}
	
	static def getDescriptionTemplatesXML(String alias){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetDescriptionTemplatesRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <ErrorLanguage>en_US</ErrorLanguage>
  <WarningLevel>High</WarningLevel>
</GetDescriptionTemplatesRequest> '''
	}
	
	static def getDisputeXML(String alias, String disputeID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetDisputeRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <DisputeID>'''+disputeID+'''</DisputeID>
</GetDisputeRequest> '''
	}
	
	static def geteBayDetailsXML(String alias){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GeteBayDetailsRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
</GeteBayDetailsRequest> '''
	}
	
	static def getFeedbackXML(String alias, String userID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetFeedbackRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <UserID>'''+userID+'''</UserID>
</GetFeedbackRequest>
 '''
	}
	
	static def getItemXML(String alias, String itemID){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetItemRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <DetailLevel>ReturnAll</DetailLevel>
  <ItemID>'''+itemID+'''</ItemID>
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
</GetItemRequest> '''
	}
	
	static def getTimeXML(String alias) {
		return '''<?xml version="1.0" encoding="utf-8"?>
					<GeteBayOfficialTimeRequest xmlns="urn:ebay:apis:eBLBaseComponents">
						<RequesterCredentials>
							<eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
						</RequesterCredentials>
					</GeteBayOfficialTimeRequest>'''
	}
	
	static def getItemsAwaitingFeedbackXML(String alias){
		return ''' <?xml version="1.0" encoding="utf-8"?>
<GetItemsAwaitingFeedbackRequest xmlns="urn:ebay:apis:eBLBaseComponents">
  <RequesterCredentials>
    <eBayAuthToken>'''+getAliasContent("ebay.${alias}")+'''</eBayAuthToken>
  </RequesterCredentials>
  <WarningLevel>High</WarningLevel>
</GetItemsAwaitingFeedbackRequest> '''
	}
	
	
	
	
}
