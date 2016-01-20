package io.toro.ebay.model.relateditems

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.BundleStatus
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'DeleteBundlesResponse')
public class DeleteBundlesResponse {
	List<BundleStatus> bundleStatus
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}