package io.toro.ebay.model.businesspolicies

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ExtensionType

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'RemoveProfileRequest')
public class RemoveProfileRequest {
	long profileId
	List<ExtensionType> extension
}
