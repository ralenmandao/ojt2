package io.toro.ebay.model.shopping

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.NameValueListArrayType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetSingleItemRequest')
public class GetSingleItemRequest {
	String IncludeSelector
	String ItemID
	String VariationSKU
	NameValueListArrayType VariationSpecifics
	String MessageID
}
