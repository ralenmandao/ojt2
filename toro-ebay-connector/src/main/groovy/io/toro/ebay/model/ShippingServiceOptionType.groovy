package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ShippingServiceOptionType {
	Date EstimatedDeliveryMaxTime;
	Date EstimatedDeliveryMinTime;
	boolean ExpeditedService;
	boolean FastAndFree;
	String LogisticPlanType;
	AmountType ShippingInsuranceCost;
	AmountType ShippingServiceAdditionalCost;
	AmountType ShippingServiceCost;
	Date ShippingServiceCutOffTime;
	String ShippingServiceName;
	int ShippingServicePriority;
	AmountType ShippingSurcharge;
	int ShippingTimeMax;
	int ShippingTimeMin;
	List<String> ShipsTo;
}
