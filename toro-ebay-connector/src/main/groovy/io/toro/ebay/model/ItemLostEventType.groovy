package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ItemLostEventType {
	int BidCount;
	AmountType CurrentPrice;
	Date EndTime;
	ClientAlertsEventTypeCodeType EventType;
	URL GalleryURL;
	String ItemID;
	int Quantity;
	String SellerUserID;
	Date Timestamp;
	String Title;
}
