package io.toro.ebay.model.returnmanagement

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ReturnDetailType
import io.toro.ebay.model.ReturnSummaryType
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetReturnDetailResponse')
public class GetReturnDetailResponse {
	ReturnDetailType ReturnDetail
	ReturnSummaryType ReturnSummary
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
