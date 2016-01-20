package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class InternationalShippingServiceOptionType {
	Date EstimatedDeliveryMaxTime;
	Date EstimatedDeliveryMinTime;
	AmountType ImportCharge;
	AmountType ShippingInsuranceCost;
	AmountType ShippingServiceAdditionalCost;
	AmountType ShippingServiceCost;
	Date ShippingServiceCutOffTime;
	String ShippingServiceName;
	int ShippingServicePriority;
	List<String> ShipsTo;
}
