package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class InternationalShippingServiceOptionsType {
	AmountType ImportCharge;
	AmountType ShippingInsuranceCost;
	String ShippingService;
	AmountType ShippingServiceAdditionalCost;
	AmountType ShippingServiceCost;
	Date ShippingServiceCutOffTime;
	int ShippingServicePriority;
	List<String> ShipToLocation;
}
