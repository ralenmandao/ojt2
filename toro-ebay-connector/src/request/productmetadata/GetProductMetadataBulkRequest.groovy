package io.toro.ebay.model.productmetadata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ProductMetadataRequest
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetProductMetadataBulkRequest')
public class GetProductMetadataBulkRequest {
	List<ProductMetadataRequest> productMetadataRequest
}
