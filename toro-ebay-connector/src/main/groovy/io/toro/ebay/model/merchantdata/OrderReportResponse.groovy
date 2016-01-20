package io.toro.ebay.model.merchantdata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ErrorType
import io.toro.ebay.model.OrderArrayType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'OrderReportResponse')
public class OrderReportResponse {
	String Ack
	List<ErrorType> Errors
	String HardExpirationWarning
	OrderArrayType OrderArray
	String Version
}
