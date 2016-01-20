package io.toro.ebay.model.finding

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.AspectHistogramContainer
import io.toro.ebay.model.CategoryHistogramContainer
import io.toro.ebay.model.ConditionHistogramContainer
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetHistogramsResponse')
public class GetHistogramsResponse {
	AspectHistogramContainer aspectHistogramContainer
	CategoryHistogramContainer categoryHistogramContainer
	ConditionHistogramContainer conditionHistogramContainer
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
