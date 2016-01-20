package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class UserType {
	boolean AboutMePage;
	BiddingSummaryType BiddingSummary;
	String BillingEmail;
	BusinessRoleType BusinessRole;
	BuyerType BuyerInfo;
	CharityAffiliationsType CharityAffiliations;
	boolean eBayGoodStanding;
	boolean eBayWikiReadOnly;
	String EIASToken;
	String Email;
	boolean EnterpriseSeller;
	boolean FeedbackPrivate;
	FeedbackRatingStarCodeType FeedbackRatingStar;
	int FeedbackScore;
	boolean IDVerified;
	boolean MotorsDealer;
	boolean NewUser;
	PayPalAccountLevelCodeType PayPalAccountLevel;
	PayPalAccountStatusCodeType PayPalAccountStatus;
	PayPalAccountTypeCodeType PayPalAccountType;
	float PositiveFeedbackPercent;
	boolean QualifiesForSelling;
	AddressType RegistrationAddress;
	Date RegistrationDate;
	SellerType SellerInfo;
	SellerPaymentMethodCodeType SellerPaymentMethod;
	AddressType ShippingAddress;
	SiteCodeType Site;
	boolean SiteVerified;
	List<String> SkypeID;
	String StaticAlias;
	UserStatusCodeType Status;
	int TUVLevel;
	int UniqueNegativeFeedbackCount;
	int UniqueNeutralFeedbackCount;
	int UniquePositiveFeedbackCount;
	boolean UserAnonymized;
	String UserFirstName;
	UserIDType UserID;
	boolean UserIDChanged;
	Date UserIDLastChanged;
	String UserLastName;
	List<EBaySubscriptionTypeCodeType> UserSubscription;
	String VATID;
	VATStatusCodeType VATStatus;
}
