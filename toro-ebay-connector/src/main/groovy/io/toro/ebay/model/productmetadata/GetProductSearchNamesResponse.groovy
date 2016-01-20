package io.toro.ebay.model.productmetadata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.Properties
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetProductSearchNamesResponse')
public class GetProductSearchNamesResponse {
	String categoryId
	List<Properties> properties
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
