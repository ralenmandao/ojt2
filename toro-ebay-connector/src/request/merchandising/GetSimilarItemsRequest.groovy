package io.toro.ebay.model.merchandising

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.Affiliate
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetSimilarItemsRequest')
public class GetSimilarItemsRequest {
	List<String> categoryId
	List<String> categoryIdExclude
	String endTimeFrom
	String endTimeTo
	String itemId
	String listingType
	double maxPrice
	Affiliate affiliate
	int maxResults
}
