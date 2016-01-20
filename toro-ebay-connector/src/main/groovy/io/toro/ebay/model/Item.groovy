package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class Item {
	int bidCount;
	Amount buyItNowPrice;
	String country;
	Amount currentPrice;
	DiscountPriceInfo discountPriceInfo;
	String globalId;
	URL imageURL;
	String itemId;
	Amount originalPrice;
	String primaryCategoryId;
	String primaryCategoryName;
	Amount shippingCost;
	String shippingType;
	String subtitle;
	int timeLeft;
	String title;
	URL viewItemURL;
	int watchCount;
}
