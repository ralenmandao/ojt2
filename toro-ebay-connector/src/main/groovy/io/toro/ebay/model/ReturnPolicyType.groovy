package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ReturnPolicyType {
	String Description;
	String EAN;
	boolean ExtendedHolidayReturns;
	String Refund;
	String RefundOption;
	String RestockingFeeValue;
	String RestockingFeeValueOption;
	String ReturnsAccepted;
	String ReturnsAcceptedOption;
	String ReturnsWithin;
	String ReturnsWithinOption;
	String ShippingCostPaidBy;
	String ShippingCostPaidByOption;
	String WarrantyDuration;
	String WarrantyDurationOption;
	String WarrantyOffered;
	String WarrantyOfferedOption;
	String WarrantyType;
	String WarrantyTypeOption;
}
