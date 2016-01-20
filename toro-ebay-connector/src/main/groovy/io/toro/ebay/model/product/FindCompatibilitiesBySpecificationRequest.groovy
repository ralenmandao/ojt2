package io.toro.ebay.model.product

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.PropertyValue
import io.toro.ebay.model.PaginationInput
import io.toro.ebay.model.CompatibilitySort
import io.toro.ebay.model.PropertyValue
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FindCompatibilitiesBySpecificationRequest')
public class FindCompatibilitiesBySpecificationRequest {
	String categoryId
	List<PropertyValue> compatibilityPropertyFilter
	List<String> dataSet
	List<String> datasetPropertyName
	boolean exactMatch
	PaginationInput paginationInput
	List<CompatibilitySort> sortOrder
	List<PropertyValue> specification
}
