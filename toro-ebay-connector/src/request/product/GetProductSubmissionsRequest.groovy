package io.toro.ebay.model.product

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.OutputSelector
import io.toro.ebay.model.PaginationInput
import io.toro.ebay.model.ProductSubmissionFilter
import io.toro.ebay.model.SortOption
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetProductSubmissionsRequest')
public class GetProductSubmissionsRequest {
	OutputSelector outputSelector
	PaginationInput paginationInput
	List<ProductSubmissionFilter> productSubmissionFilter
	List<SortOption> sortOption
}
