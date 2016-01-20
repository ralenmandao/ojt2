package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class RelatedProduct {
	long categoryID;
	Discount discount;
	int maxQtyForSinglePrimary;
	int rank;
	String SKU;
	String title;
}
