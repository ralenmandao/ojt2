package io.toro.ebay.model.shopping

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.DomainHistogramType
import io.toro.ebay.model.HalfProductsType
import io.toro.ebay.model.AckCodeType
import io.toro.ebay.model.ErrorType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FindHalfProductsResponse')
public class FindHalfProductsResponse {
	int ApproximatePages
	DomainHistogramType DomainHistogram
	boolean MoreResults
	int PageNumber
	List<HalfProductsType> Products
	int TotalProducts
	AckCodeType Ack
	String Build
	String CorrelationID
	List<ErrorType> Errors
	String Timestamp
	String Version
}
