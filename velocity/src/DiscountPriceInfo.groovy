package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.*
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class DiscountPriceInfo {
	MapExposureEnum minimumAdvertisedPriceExposure;
	Amount originalRetailPrice;
	PriceTreatmentEnum pricingTreatment;
	boolean soldOffEbay;
	boolean soldOnEbay;
}
