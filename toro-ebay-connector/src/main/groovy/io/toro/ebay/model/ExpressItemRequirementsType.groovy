package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ExpressItemRequirementsType {
	boolean CombinedShippingDiscount;
	boolean DomesticShippingCost;
	boolean EligibleCheckout;
	boolean EligibleItemCondition;
	boolean EligiblePayPalAccount;
	boolean EligibleReturnPolicy;
	boolean ExpressApproved;
	boolean ExpressEligibleListingType;
	boolean ExpressEnabledCategory;
	boolean ExpressOptOut;
	boolean NoCharity;
	boolean NoPreapprovedBidderList;
	boolean PayPalAccountAcceptsUnconfirmedAddress;
	boolean Picture;
	boolean PriceAboveMinimum;
	boolean PriceBelowMaximum;
	boolean SellerExpressEligible;
	boolean ShipFromEligibleCountry;
}
