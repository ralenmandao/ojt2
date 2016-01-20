package io.toro.ebay.model.shopping

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ProductIDType
import io.toro.ebay.model.ReviewSortCodeType
import io.toro.ebay.model.SortOrderCodeType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FindReviewsAndGuidesRequest')
public class FindReviewsAndGuidesRequest {
	String CategoryID
	int MaxResultsPerPage
	int PageNumber
	ProductIDType ProductID
	ReviewSortCodeType ReviewSort
	SortOrderCodeType SortOrder
	String UserID
	String MessageID
}
