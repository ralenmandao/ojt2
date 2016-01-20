package io.toro.ebay.model.shopping

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.BuyingGuideDetailsType
import io.toro.ebay.model.ProductIDType
import io.toro.ebay.model.ReviewDetailsType
import io.toro.ebay.model.AckCodeType
import io.toro.ebay.model.ErrorType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FindReviewsAndGuidesResponse')
public class FindReviewsAndGuidesResponse {
	int BuyingGuideCount
	BuyingGuideDetailsType BuyingGuideDetails
	int PageNumber
	int PositiveHelpfulnessVotes
	ProductIDType ProductID
	int ReviewCount
	ReviewDetailsType ReviewDetails
	int ReviewerRank
	String ReviewsAndGuidesURL
	int TotalHelpfulnessVotes
	int TotalPages
	AckCodeType Ack
	String Build
	String CorrelationID
	List<ErrorType> Errors
	String Timestamp
	String Version
}
