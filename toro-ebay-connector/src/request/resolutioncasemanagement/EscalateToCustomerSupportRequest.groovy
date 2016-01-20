package io.toro.ebay.model.resolutioncasemanagement

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.CaseIdType
import io.toro.ebay.model.EscalationReasonType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'EscalateToCustomerSupportRequest')
public class EscalateToCustomerSupportRequest {
	CaseIdType caseId
	String comments
	EscalationReasonType escalationReason
}
