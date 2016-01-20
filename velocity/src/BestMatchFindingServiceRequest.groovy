package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.*
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class BestMatchFindingServiceRequest {
	Affiliate affiliate;
	String buyerPostalCode;
	PaginationInput paginationInput;
}
