package io.toro.ebay.model.merchantdata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.OrderDetailsType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'SoldReportResponse')
public class SoldReportResponse {
	List<OrderDetailsType> OrderDetails
}
