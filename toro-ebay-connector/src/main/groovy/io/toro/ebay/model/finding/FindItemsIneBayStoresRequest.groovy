package io.toro.ebay.model.finding

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.AspectFilter
import io.toro.ebay.model.ItemFilter
import io.toro.ebay.model.OutputSelectorType
import io.toro.ebay.model.Affiliate
import io.toro.ebay.model.PaginationInput
import io.toro.ebay.model.SortOrderType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FindItemsIneBayStoresRequest')
public class FindItemsIneBayStoresRequest {
	List<AspectFilter> aspectFilter
	List<String> categoryId
	List<ItemFilter> itemFilter
	String keywords
	List<OutputSelectorType> outputSelector
	String storeName
	Affiliate affiliate
	String buyerPostalCode
	PaginationInput paginationInput
	SortOrderType sortOrder
}
