package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class FindReviewsAndGuidesResponseType {
	int BuyingGuideCount;
	BuyingGuideDetailsType BuyingGuideDetails;
	int PageNumber;
	int PositiveHelpfulnessVotes;
	ProductIDType ProductID;
	int ReviewCount;
	ReviewDetailsType ReviewDetails;
	int ReviewerRank;
	URL ReviewsAndGuidesURL;
	int TotalHelpfulnessVotes;
	int TotalPages;
}
