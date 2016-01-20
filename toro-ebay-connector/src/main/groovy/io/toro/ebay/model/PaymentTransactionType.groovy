package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class PaymentTransactionType {
	AmountType FeeOrCreditAmount;
	UserIdentityType Payee;
	UserIdentityType Payer;
	AmountType PaymentAmount;
	TransactionReferenceType PaymentReferenceID;
	PaymentTransactionStatusCodeType PaymentStatus;
	Date PaymentTime;
	TransactionReferenceType ReferenceID;
}
