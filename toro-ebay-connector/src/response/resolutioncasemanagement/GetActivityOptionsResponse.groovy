package io.toro.ebay.model.resolutioncasemanagement

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ActivityOptionListType
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetActivityOptionsResponse')
public class GetActivityOptionsResponse {
	ActivityOptionListType activityOptions
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
