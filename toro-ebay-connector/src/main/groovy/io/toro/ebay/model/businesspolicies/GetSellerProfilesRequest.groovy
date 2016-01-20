package io.toro.ebay.model.businesspolicies

import groovy.transform.ToString
import io.toro.ebay.model.ExtensionType
import io.toro.ebay.model.ProfileType

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetSellerProfilesRequest')
public class GetSellerProfilesRequest {
	boolean includeDetails
	List<Long> profileId
	List<String> profileName
	List<ProfileType> profileType
	List<ExtensionType> extension
}
