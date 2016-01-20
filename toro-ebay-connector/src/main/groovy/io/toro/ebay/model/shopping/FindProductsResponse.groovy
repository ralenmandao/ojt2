package io.toro.ebay.model.shopping

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.DomainHistogramType
import io.toro.ebay.model.SimpleItemArrayType
import io.toro.ebay.model.CatalogProductType
import io.toro.ebay.model.AckCodeType
import io.toro.ebay.model.ErrorType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FindProductsResponse')
public class FindProductsResponse {
	int ApproximatePages
	DomainHistogramType DomainHistogram
	boolean DuplicateItems
	SimpleItemArrayType ItemArray
	boolean MoreResults
	int PageNumber
	List<CatalogProductType> Product
	int TotalProducts
	AckCodeType Ack
	String Build
	String CorrelationID
	List<ErrorType> Errors
	String Timestamp
	String Version
}
