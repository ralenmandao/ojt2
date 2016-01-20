package io.toro.ebay.model.clientalerts

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ChannelDescriptorType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetPublicAlertsRequest')
public class GetPublicAlertsRequest {
	List<ChannelDescriptorType> ChannelDescriptor
}
