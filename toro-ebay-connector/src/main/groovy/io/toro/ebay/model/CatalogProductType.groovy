package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class CatalogProductType {
	URL DetailsURL;
	boolean DisplayStockPhotos;
	String DomainName;
	int ItemCount;
	NameValueListArrayType ItemSpecifics;
	ProductIDType ProductID;
	ProductStateCodeType ProductState;
	int ReviewCount;
	URL StockPhotoURL;
	String Title;
}
