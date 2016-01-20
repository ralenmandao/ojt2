package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class VariationType {
	boolean Delete;
	DiscountPriceInfoType DiscountPriceInfo;
	String PrivateNotes;
	int Quantity;
	SellingManagerProductInventoryStatusType SellingManagerProductInventoryStatus;
	SellingStatusType SellingStatus;
	SKUType SKU;
	AmountType StartPrice;
	AmountType UnitCost;
	int UnitsAvailable;
	VariationProductListingDetailsType VariationProductListingDetails;
	NameValueListArrayType VariationSpecifics;
	String VariationTitle;
	URL VariationViewItemURL;
	long WatchCount;
}
