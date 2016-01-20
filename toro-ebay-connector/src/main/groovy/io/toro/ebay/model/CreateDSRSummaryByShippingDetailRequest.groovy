package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class CreateDSRSummaryByShippingDetailRequest {
	DateRange dateRange;
	String dateRangeEventType;
	String shippingCostType;
	String shippingDestinationType;
	List<String> shippingService;
	List<String> shipToCountry;
}
