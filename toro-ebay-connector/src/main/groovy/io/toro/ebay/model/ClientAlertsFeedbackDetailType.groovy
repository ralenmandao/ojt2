package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ClientAlertsFeedbackDetailType {
	String CommentingUser;
	String CommentText;
	CommentTypeCodeType CommentType;
	String FeedbackID;
	int FeedbackScore;
	String ItemID;
	AmountType ItemPrice;
	String ItemTitle;
	TradingRoleCodeType Role;
	String TransactionID;
}
