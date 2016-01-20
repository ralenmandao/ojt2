package io.toro.ebay.model.productmetadata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.PropertyValue
import io.toro.ebay.model.SortOrder
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetCompatibilitySearchValuesBulkRequest')
public class GetCompatibilitySearchValuesBulkRequest {
	List<String> propertyName
	String categoryId
	boolean listFormatOnly
	List<PropertyValue> propertyFilter
	List<SortOrder> sortOrder
}
