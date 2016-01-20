package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class StorefrontType {
	long StoreCategory2ID;
	String StoreCategory2Name;
	long StoreCategoryID;
	String StoreCategoryName;
	String StoreName;
	URL StoreURL;
}
