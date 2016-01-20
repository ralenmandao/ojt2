package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class NotificationEventType {
	Date CreationDate;
	String ExternalUserData;
	NotificationEventNameType NotificationEventName;
	String OtherPartyId;
	ReturnUserRoleType OtherPartyRole;
	String RecipientUserID;
	String ReturnGlobalId;
	String ReturnId;
	String ReturnStatus;
}
