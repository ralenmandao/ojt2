package io.toro.ebay.model.businesspolicies

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.long
import io.toro.ebay.model.ProfileType
import io.toro.ebay.model.ExtensionType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetSellerProfilesRequest')
public class GetSellerProfilesRequest {
	boolean includeDetails
	List<long> profileId
	List<String> profileName
	List<ProfileType> profileType
	List<ExtensionType> extension
}
