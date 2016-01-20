package io.toro.ebay.model.shopping

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.CategoryArrayType
import io.toro.ebay.model.AckCodeType
import io.toro.ebay.model.ErrorType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetCategoryInfoResponse')
public class GetCategoryInfoResponse {
	CategoryArrayType CategoryArray
	int CategoryCount
	String CategoryVersion
	String UpdateTime
	AckCodeType Ack
	String Build
	String CorrelationID
	List<ErrorType> Errors
	String Timestamp
	String Version
}
