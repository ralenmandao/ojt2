package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ShippingServiceOptionsType {
	boolean ExpeditedService;
	boolean FreeShipping;
	AmountType ImportCharge;
	boolean LocalPickup;
	String LogisticPlanType;
	AmountType ShippingInsuranceCost;
	List<ShippingPackageInfoType> ShippingPackageInfo;
	String ShippingService;
	AmountType ShippingServiceAdditionalCost;
	AmountType ShippingServiceCost;
	Date ShippingServiceCutOffTime;
	int ShippingServicePriority;
	AmountType ShippingSurcharge;
	int ShippingTimeMax;
	int ShippingTimeMin;
}
