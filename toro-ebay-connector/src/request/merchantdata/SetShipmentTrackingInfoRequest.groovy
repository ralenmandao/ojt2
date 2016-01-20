package io.toro.ebay.model.merchantdata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ShipmentType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'SetShipmentTrackingInfoRequest')
public class SetShipmentTrackingInfoRequest {
	boolean IsPaid
	boolean IsShipped
	String OrderID
	String OrderLineItemID
	ShipmentType Shipment
}
