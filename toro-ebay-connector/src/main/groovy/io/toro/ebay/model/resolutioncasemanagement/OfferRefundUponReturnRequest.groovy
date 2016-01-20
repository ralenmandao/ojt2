package io.toro.ebay.model.resolutioncasemanagement

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.CaseIdType
import io.toro.ebay.model.Address
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'OfferRefundUponReturnRequest')
public class OfferRefundUponReturnRequest {
	String additionalReturnInstructions
	CaseIdType caseId
	Address returnAddress
	String returnMerchandiseAuthorization
}
