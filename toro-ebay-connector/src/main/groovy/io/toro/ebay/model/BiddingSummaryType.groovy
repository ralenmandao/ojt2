package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class BiddingSummaryType {
	int BidActivityWithSeller;
	int BidRetractions;
	int BidsToUniqueCategories;
	int BidsToUniqueSellers;
	List<ItemBidDetailsType> ItemBidDetails;
	int SummaryDays;
	int TotalBids;
}
