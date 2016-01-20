package io.toro.ebay.model.clientalerts

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ClientAlertsType
import io.toro.ebay.model.AckCodeType
import io.toro.ebay.model.ErrorType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetUserAlertsResponse')
public class GetUserAlertsResponse {
	ClientAlertsType ClientAlerts
	AckCodeType Ack
	List<ErrorType> Errors
}
