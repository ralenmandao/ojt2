package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ItemMarkedShippedEventType {
	ClientAlertsEventTypeCodeType EventType;
	String ItemID;
	String OrderID;
	String SellerUserID;
	ClientAlertsShipmentType Shipment;
	Date Timestamp;
	String Title;
	String TransactionID;
}
