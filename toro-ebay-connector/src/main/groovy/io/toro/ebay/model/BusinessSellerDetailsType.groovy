package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class BusinessSellerDetailsType {
	String AdditionalContactInformation;
	AddressType Address;
	String Email;
	String Fax;
	boolean LegalInvoice;
	String TermsAndConditions;
	String TradeRegistrationNumber;
	VATDetailsType VATDetails;
}
