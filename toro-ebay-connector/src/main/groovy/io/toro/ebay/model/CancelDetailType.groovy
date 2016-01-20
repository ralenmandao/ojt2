package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class CancelDetailType {
	Date CancelCompleteDate;
	Date CancelIntiationDate;
	String CancelIntiator;
	String CancelReason;
	String CancelReasonDetails;
}
