package io.toro.ebay.model.listingrecommendation

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.container
import io.toro.ebay.model.container
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'RecommendationItemIdsResponse')
public class RecommendationItemIdsResponse {
	container items
	container pagination
}
