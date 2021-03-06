package io.toro.ebay.model.feedback

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'CreateDSRSummaryByPeriodResponse')
public class CreateDSRSummaryByPeriodResponse {
	String jobId
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
