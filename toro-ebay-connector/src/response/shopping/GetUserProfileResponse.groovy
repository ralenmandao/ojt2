package io.toro.ebay.model.shopping

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.FeedbackDetailType
import io.toro.ebay.model.FeedbackHistoryType
import io.toro.ebay.model.SimpleUserType
import io.toro.ebay.model.AckCodeType
import io.toro.ebay.model.ErrorType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetUserProfileResponse')
public class GetUserProfileResponse {
	List<FeedbackDetailType> FeedbackDetails
	FeedbackHistoryType FeedbackHistory
	SimpleUserType User
	AckCodeType Ack
	String Build
	String CorrelationID
	List<ErrorType> Errors
	String Timestamp
	String Version
}
