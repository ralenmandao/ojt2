package io.toro.ebay.model.productmetadata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
import io.toro.ebay.model.PropertyValue
import io.toro.ebay.model.PropertyNameValue
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetCompatibilitySearchValuesResponse')
public class GetCompatibilitySearchValuesResponse {
	AckValue ack
	ErrorMessage errorMessage
	String metadataVersion
	List<PropertyValue> propertyValues
	PropertyNameValue propertyValuesTree
	String timestamp
	boolean treeFormat
	String version
}
