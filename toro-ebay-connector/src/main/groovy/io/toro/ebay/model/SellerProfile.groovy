package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class SellerProfile {
	CategoryGroups categoryGroups;
	Date deletedDate;
	String profileDesc;
	long profileId;
	String profileName;
	ProfileType profileType;
	long profileVersion;
	int siteId;
}
