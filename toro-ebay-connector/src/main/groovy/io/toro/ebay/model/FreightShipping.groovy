package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class FreightShipping {
	String commodityType;
	boolean destPickupInside;
	String destPickupLocationType;
	double freightShippingClass;
	boolean originPickupInside;
	String originPickupLocationType;
	boolean packagingHelpRequired;
}
