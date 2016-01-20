package io.toro.ebay.model.relateditems

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.Bundle
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FindBundlesResponse')
public class FindBundlesResponse {
	List<Bundle> bundle
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
