package io.toro.ebay.model.product

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ProductResponse
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FindProductsByCompatibilityResponse')
public class FindProductsByCompatibilityResponse {
	List<ProductResponse> productSearchResult
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
