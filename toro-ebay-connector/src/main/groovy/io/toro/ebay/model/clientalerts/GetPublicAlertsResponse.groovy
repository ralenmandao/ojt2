package io.toro.ebay.model.clientalerts

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ChannelContentType
import io.toro.ebay.model.AckCodeType
import io.toro.ebay.model.ErrorType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetPublicAlertsResponse')
public class GetPublicAlertsResponse {
	List<ChannelContentType> Content
	AckCodeType Ack
	List<ErrorType> Errors
}
