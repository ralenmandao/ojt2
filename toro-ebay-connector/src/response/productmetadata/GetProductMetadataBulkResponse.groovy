package io.toro.ebay.model.productmetadata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ProductMetadataResponse
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetProductMetadataBulkResponse')
public class GetProductMetadataBulkResponse {
	List<ProductMetadataResponse> productMetadataResponse
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
