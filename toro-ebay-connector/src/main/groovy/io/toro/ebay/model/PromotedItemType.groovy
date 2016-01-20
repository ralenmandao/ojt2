package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class PromotedItemType {
	ItemIDType ItemID;
	ListingTypeCodeType ListingType;
	String PictureURL;
	int Position;
	List<PromotionDetailsType> PromotionDetails;
	PromotionItemSelectionCodeType SelectionType;
	int TimeLeft;
	String Title;
}
