package io.toro.ebay.model.product

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.PropertyValue
import io.toro.ebay.model.ProductStatus
import io.toro.ebay.model.PaginationInput
import io.toro.ebay.model.ProductIdentifier
import io.toro.ebay.model.CompatibilitySort
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetProductCompatibilitiesRequest')
public class GetProductCompatibilitiesRequest {
	List<PropertyValue> applicationPropertyFilter
	List<String> dataset
	List<String> datasetPropertyName
	ProductStatus disabledProductFilter
	PaginationInput paginationInput
	ProductIdentifier productIdentifier
	List<CompatibilitySort> sortOrder
}
