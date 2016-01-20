package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ShipmentType {
	String carrierUsed;
	Date deliveryDate;
	Date maxEstDeliveryDate;
	Date minEstDeliveryDate;
	String returnMerchandiseAuthorization;
	ShipmentStatusType shipmentStatus;
	Address shippingAddress;
	Amount shippingCost;
	String trackingNumber;
}
