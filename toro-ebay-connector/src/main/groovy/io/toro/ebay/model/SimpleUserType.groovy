package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class SimpleUserType {
	URL AboutMeURL;
	URL FeedbackDetailsURL;
	boolean FeedbackPrivate;
	FeedbackRatingStarCodeType FeedbackRatingStar;
	int FeedbackScore;
	URL MyWorldLargeImage;
	URL MyWorldSmallImage;
	URL MyWorldURL;
	boolean NewUser;
	float PositiveFeedbackPercent;
	Date RegistrationDate;
	SiteCodeType RegistrationSite;
	URL ReviewsAndGuidesURL;
	SellerBusinessCodeType SellerBusinessType;
	URL SellerItemsURL;
	SellerLevelCodeType SellerLevel;
	UserStatusCodeType Status;
	String StoreName;
	URL StoreURL;
	boolean TopRatedSeller;
	boolean UserAnonymized;
	String UserID;
}
