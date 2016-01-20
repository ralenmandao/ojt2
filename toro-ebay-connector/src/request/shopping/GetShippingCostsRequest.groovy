package io.toro.ebay.model.shopping

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.CountryCodeType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetShippingCostsRequest')
public class GetShippingCostsRequest {
	CountryCodeType DestinationCountryCode
	String DestinationPostalCode
	boolean IncludeDetails
	String ItemID
	int QuantitySold
	String MessageID
}
