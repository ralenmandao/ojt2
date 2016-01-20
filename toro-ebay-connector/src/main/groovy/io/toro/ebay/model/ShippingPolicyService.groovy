package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ShippingPolicyService {
	boolean buyerResponsibleForShipping;
	Amount codFee;
	boolean fastShipping;
	boolean freeShipping;
	Amount shippingOverrideFee;
	String shippingService;
	Amount shippingServiceAdditionalCost;
	Amount shippingServiceCost;
	Amount shippingSurcharge;
	String shippingType;
	List<String> shipToLocation;
	int sortOrderId;
}
