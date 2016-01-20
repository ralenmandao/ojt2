package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ReturnPolicyInfo {
	String description;
	String holidayReturns;
	String refundOption;
	String restockingFeeValue;
	String returnsAcceptedOption;
	String returnsWithinOption;
	String shippingCostPaidByOption;
	String warrantyDurationOption;
	String warrantyOfferedOption;
	String warrantyTypeOption;
}
