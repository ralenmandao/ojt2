package io.toro.ebay.model.product

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.PaginationOutput
import io.toro.ebay.model.ProductSubmissionResult
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetProductSubmissionsResponse')
public class GetProductSubmissionsResponse {
	PaginationOutput paginationOutput
	List<ProductSubmissionResult> productSubmissionResponse
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
