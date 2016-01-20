package io.toro.ebay.model.merchandising

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.Affiliate
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetTopSellingProductsRequest')
public class GetTopSellingProductsRequest {
	Affiliate affiliate
	int maxResults
}
