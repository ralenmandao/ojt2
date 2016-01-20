package io.toro.ebay.model.feedback

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.DateRange
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'CreateDSRSummaryByPeriodRequest')
public class CreateDSRSummaryByPeriodRequest {
	DateRange dateRange
	String dateRangeEventType
}
