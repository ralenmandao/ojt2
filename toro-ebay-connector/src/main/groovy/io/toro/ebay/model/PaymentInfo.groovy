package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class PaymentInfo {
	List<String> acceptedPaymentMethod;
	int daysToFullPayment;
	DepositDetails depositDetails;
	boolean immediatePay;
	String paymentInstructions;
	String paypalEmailAddress;
}
