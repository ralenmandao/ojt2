package io.toro.ebay.model.listingrecommendation

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.container
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'ItemRecommendationsResponse')
public class ItemRecommendationsResponse {
	String itemId
	container recommendation
}
