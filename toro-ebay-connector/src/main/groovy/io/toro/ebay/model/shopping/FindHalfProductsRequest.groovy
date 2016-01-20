package io.toro.ebay.model.shopping

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ProductIDType
import io.toro.ebay.model.ProductSortCodeType
import io.toro.ebay.model.SortOrderCodeType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FindHalfProductsRequest')
public class FindHalfProductsRequest {
	boolean AvailableItemsOnly
	List<String> DomainName
	String IncludeSelector
	int MaxEntries
	int PageNumber
	ProductIDType ProductID
	ProductSortCodeType ProductSort
	String QueryKeywords
	String SellerID
	SortOrderCodeType SortOrder
	String MessageID
}
