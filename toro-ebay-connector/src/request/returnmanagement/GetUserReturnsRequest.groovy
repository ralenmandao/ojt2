package io.toro.ebay.model.returnmanagement

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.DateRangeFilterType
import io.toro.ebay.model.ItemFilterType
import io.toro.ebay.model.UserFilterType
import io.toro.ebay.model.PaginationInput
import io.toro.ebay.model.ReturnStatusFilterType
import io.toro.ebay.model.ReturnSortOrderType
import io.toro.ebay.model.ReturnSortType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetUserReturnsRequest')
public class GetUserReturnsRequest {
	DateRangeFilterType creationDateRangeFilter
	ItemFilterType itemFilter
	String orderId
	UserFilterType otherUserFilter
	PaginationInput paginationInput
	ReturnStatusFilterType ReturnStatusFilter
	ReturnSortOrderType sortOrderType
	ReturnSortType sortType
}
