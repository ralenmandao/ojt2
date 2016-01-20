package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.*
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class SellingStatus {
	int bidCount;
	Amount convertedCurrentPrice;
	Amount currentPrice;
	String sellingState;
	duration timeLeft;
}
