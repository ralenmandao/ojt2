package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.*
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ListingInfo {
	boolean bestOfferEnabled;
	boolean buyItNowAvailable;
	Amount buyItNowPrice;
	Amount convertedBuyItNowPrice;
	Date endTime;
	boolean gift;
	String listingType;
	Date startTime;
}
