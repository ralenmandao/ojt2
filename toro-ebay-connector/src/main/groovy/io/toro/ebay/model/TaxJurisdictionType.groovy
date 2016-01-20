package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class TaxJurisdictionType {
	String DetailVersion;
	String JurisdictionID;
	String JurisdictionName;
	float SalesTaxPercent;
	boolean ShippingIncludedInTax;
	Date UpdateTime;
}
