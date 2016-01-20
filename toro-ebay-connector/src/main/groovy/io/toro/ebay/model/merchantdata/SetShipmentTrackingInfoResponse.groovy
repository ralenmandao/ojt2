package io.toro.ebay.model.merchantdata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.AckCodeType
import io.toro.ebay.model.ErrorType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'SetShipmentTrackingInfoResponse')
public class SetShipmentTrackingInfoResponse {
	String OrderLineItemID
	AckCodeType Ack
	List<ErrorType> Errors
}
