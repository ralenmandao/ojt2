package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class HalfCatalogProductType {
	URL DetailsURL;
	boolean DisplayStockPhotos;
	String DomainName;
	SimpleItemArrayType ItemArray;
	int ItemCount;
	NameValueListArrayType ItemSpecifics;
	AmountType MinPrice;
	ProductIDType ProductID;
	int ReviewCount;
	ShippingCostSummaryType ShippingCostSummary;
	URL StockPhotoURL;
	String Title;
}
