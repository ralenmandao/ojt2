package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class CrossPromotionsType {
	ItemIDType ItemID;
	PromotionSchemeCodeType PrimaryScheme;
	List<PromotedItemType> PromotedItem;
	PromotionMethodCodeType PromotionMethod;
	String SellerID;
	boolean ShippingDiscount;
	String StoreName;
}
