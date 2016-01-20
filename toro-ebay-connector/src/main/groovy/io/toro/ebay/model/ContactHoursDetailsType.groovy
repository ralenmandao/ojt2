package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ContactHoursDetailsType {
	boolean Hours1AnyTime;
	DaysCodeType Hours1Days;
	String Hours1From;
	String Hours1To;
	boolean Hours2AnyTime;
	DaysCodeType Hours2Days;
	String Hours2From;
	String Hours2To;
	String TimeZoneID;
}
