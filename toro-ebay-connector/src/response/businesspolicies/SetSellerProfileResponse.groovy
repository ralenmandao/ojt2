package io.toro.ebay.model.businesspolicies

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.PaymentProfile
import io.toro.ebay.model.ReturnPolicyProfile
import io.toro.ebay.model.ShippingPolicyProfile
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'SetSellerProfileResponse')
public class SetSellerProfileResponse {
	PaymentProfile paymentProfile
	ReturnPolicyProfile returnPolicyProfile
	ShippingPolicyProfile shippingPolicyProfile
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
