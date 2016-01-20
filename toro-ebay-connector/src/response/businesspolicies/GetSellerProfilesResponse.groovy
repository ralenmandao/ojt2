package io.toro.ebay.model.businesspolicies

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.PaymentProfileList
import io.toro.ebay.model.ReturnPolicyProfileList
import io.toro.ebay.model.ShippingPolicyProfileList
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetSellerProfilesResponse')
public class GetSellerProfilesResponse {
	PaymentProfileList paymentProfileList
	ReturnPolicyProfileList returnPolicyProfileList
	ShippingPolicyProfileList shippingPolicyProfile
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
