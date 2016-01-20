package io.toro.ebay.model.resolutioncasemanagement

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.CaseStatusFilterType
import io.toro.ebay.model.CaseTypeFilterType
import io.toro.ebay.model.DateRangeFilterType
import io.toro.ebay.model.ItemFilterType
import io.toro.ebay.model.PaginationInput
import io.toro.ebay.model.CaseSortOrderType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetUserCasesRequest')
public class GetUserCasesRequest {
	CaseStatusFilterType caseStatusFilter
	CaseTypeFilterType caseTypeFilter
	DateRangeFilterType creationDateRangeFilter
	ItemFilterType itemFilter
	PaginationInput paginationInput
	CaseSortOrderType sortOrder
}
