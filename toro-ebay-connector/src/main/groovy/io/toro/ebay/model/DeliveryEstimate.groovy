package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class DeliveryEstimate {
	String estimateTreatment;
	int maxActualDelivery;
	int maxConfidence;
	int maxDelivery;
	Date maxDeliveryDate;
	int minActualDelivery;
	int minConfidence;
	int minDelivery;
	Date minDeliveryDate;
}
