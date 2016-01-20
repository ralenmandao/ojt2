package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ListingDetailsType {
	boolean Adult;
	AmountType BestOfferAutoAcceptPrice;
	boolean BindingAuction;
	boolean BuyItNowAvailable;
	boolean CheckoutEnabled;
	AmountType ConvertedBuyItNowPrice;
	AmountType ConvertedReservePrice;
	AmountType ConvertedStartPrice;
	EndReasonCodeType EndingReason;
	Date EndTime;
	boolean HasPublicMessages;
	boolean HasReservePrice;
	boolean HasUnansweredQuestions;
	String LocalListingDistance;
	String MinimumBestOfferMessage;
	AmountType MinimumBestOfferPrice;
	boolean PayPerLeadEnabled;
	ItemIDType RelistedItemID;
	ItemIDType SecondChanceOriginalItemID;
	SellerBusinessCodeType SellerBusinessType;
	Date StartTime;
	ItemIDType TCROriginalItemID;
	URL ViewItemURL;
	URL ViewItemURLForNaturalSearch;
}
