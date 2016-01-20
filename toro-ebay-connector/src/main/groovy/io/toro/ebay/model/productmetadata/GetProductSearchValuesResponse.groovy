package io.toro.ebay.model.productmetadata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.PropertyValue
import io.toro.ebay.model.PropertyNameValue
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetProductSearchValuesResponse')
public class GetProductSearchValuesResponse {
	String metadataVersion
	List<PropertyValue> propertyValues
	PropertyNameValue propertyValuesTree
	boolean treeFormat
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
