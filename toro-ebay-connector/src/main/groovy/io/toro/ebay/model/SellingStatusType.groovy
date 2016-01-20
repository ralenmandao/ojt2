package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class SellingStatusType {
	boolean AdminEnded;
	int BidCount;
	long BidderCount;
	AmountType BidIncrement;
	AmountType ConvertedCurrentPrice;
	AmountType CurrentPrice;
	AmountType FinalValueFee;
	UserType HighBidder;
	int LeadCount;
	ListingStatusCodeType ListingStatus;
	AmountType MinimumToBid;
	PromotionalSaleDetailsType PromotionalSaleDetails;
	int QuantitySold;
	int QuantitySoldByPickupInStore;
	boolean ReserveMet;
	boolean SecondChanceEligible;
	boolean SoldAsBin;
	SuggestedBidValueType SuggestedBidValues;
}
