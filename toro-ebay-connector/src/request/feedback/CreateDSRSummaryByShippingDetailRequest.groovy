package io.toro.ebay.model.feedback

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.DateRange
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'CreateDSRSummaryByShippingDetailRequest')
public class CreateDSRSummaryByShippingDetailRequest {
	DateRange dateRange
	String dateRangeEventType
	String shippingCostType
	String shippingDestinationType
	List<String> shippingService
	List<String> shipToCountry
}
