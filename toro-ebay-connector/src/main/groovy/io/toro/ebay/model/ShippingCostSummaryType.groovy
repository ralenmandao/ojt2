package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ShippingCostSummaryType {
	AmountType ImportCharge;
	AmountType InsuranceCost;
	InsuranceOptionCodeType InsuranceOption;
	AmountType ListedShippingServiceCost;
	boolean LocalPickup;
	String LogisticPlanType;
	AmountType ShippingServiceCost;
	String ShippingServiceName;
	ShippingTypeCodeType ShippingType;
}
