package io.toro.ebay.model.merchandising

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ItemRecommendations
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetSimilarItemsResponse')
public class GetSimilarItemsResponse {
	ItemRecommendations itemRecommendations
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
