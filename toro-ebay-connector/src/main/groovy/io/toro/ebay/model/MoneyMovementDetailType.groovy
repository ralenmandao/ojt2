package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class MoneyMovementDetailType {
	Amount amount;
	CaseUserType fromParty;
	PaymentMethodType paymentMethod;
	String paypalTransactionId;
	MoneyMovementStatusType status;
	CaseUserType toParty;
	Date transactionDate;
	MoneyMovementType type;
	@XmlAttribute
	String id;
	@XmlAttribute
	String parentId;
}
