package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class GetSimilarItemsRequest {
	List<String> categoryId;
	List<String> categoryIdExclude;
	Date endTimeFrom;
	Date endTimeTo;
	List<ItemFilter> itemFilter;
	String itemId;
	String listingType;
	Amount maxPrice;
}
