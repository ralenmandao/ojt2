package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ClientAlertsItemType {
	int BidCount;
	AmountType CurrentPrice;
	Date EndTime;
	URL GalleryURL;
	String HighBidderEIASToken;
	String HighBidderUserID;
	String ItemID;
	Date LastModifiedDate;
	AmountType MinimumToBid;
	AmountType Price;
	String PrimaryCategoryID;
	int Quantity;
	boolean ReserveMet;
	String SellerUserID;
	String Title;
	URL ViewItemURL;
}
