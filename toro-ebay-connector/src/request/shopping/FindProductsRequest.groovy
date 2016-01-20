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
@XmlRootElement(name = 'FindProductsRequest')
public class FindProductsRequest {
	boolean AvailableItemsOnly
	String CategoryID
	List<String> DomainName
	boolean HideDuplicateItems
	String IncludeSelector
	int MaxEntries
	int PageNumber
	ProductIDType ProductID
	ProductSortCodeType ProductSort
	String QueryKeywords
	SortOrderCodeType SortOrder
	String MessageID
}
