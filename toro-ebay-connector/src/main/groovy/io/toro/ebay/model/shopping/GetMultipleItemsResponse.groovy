package io.toro.ebay.model.shopping

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.SimpleItemType
import io.toro.ebay.model.AckCodeType
import io.toro.ebay.model.ErrorType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetMultipleItemsResponse')
public class GetMultipleItemsResponse {
	List<SimpleItemType> Item
	AckCodeType Ack
	String Build
	String CorrelationID
	List<ErrorType> Errors
	String Timestamp
	String Version
}
