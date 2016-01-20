package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class Bundle {
	String bundleDescription;
	long bundleID;
	String bundleName;
	BundleStatusEnum bundleStatus;
	BundleTypeEnum bundleType;
	boolean discountRelatedSKUsOnly;
	boolean includeNonFreeShippingRelatedSKUs;
	int isoCurrencyCode;
	String offerHtmlMessage;
	String offerMessage;
	String offerTemplateName;
	List<String> primarySKU;
	List<RelatedProductGroup> relatedProductGroup;
	Date scheduledEndTime;
	Date scheduledStartTime;
	GlobalId site;
}
