package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class FeedbackDetailType {
	String CommentingUser;
	int CommentingUserScore;
	boolean CommentReplaced;
	String CommentText;
	Date CommentTime;
	CommentTypeCodeType CommentType;
	boolean Countable;
	String FeedbackID;
	String FeedbackResponse;
	String FollowUp;
	boolean FollowUpReplaced;
	String ItemID;
	AmountType ItemPrice;
	String ItemTitle;
	boolean ResponseReplaced;
	TradingRoleCodeType Role;
	String TransactionID;
}
