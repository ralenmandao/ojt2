package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ShippingPolicyInfo {
	int dispatchTimeMax;
	String dispatchTimeReason;
	String domesticRateTable;
	List<ShippingPolicyInfoService> domesticShippingPolicyInfoService;
	String domesticShippingType;
	boolean EligibleForPickupDropOff;
	List<String> excludeShipToLocation;
	FreightShipping freightShipping;
	boolean GlobalShipping;
	Insurance insurance;
	Amount internationalPackagingHandlingCosts;
	String intlRateTable;
	List<ShippingPolicyInfoService> intlShippingPolicyInfoService;
	String intlShippingType;
	Amount packagingHandlingCosts;
	String shippingOption;
	IsoCurrencyCode shippingPolicyCurrency;
	ShippingPolicyIdentity shippingPolicyIdentity;
	String shippingPolicyName;
	ShippingProfileDiscountInfo shippingProfileDiscountInfo;
	List<String> shipToLocations;
}
