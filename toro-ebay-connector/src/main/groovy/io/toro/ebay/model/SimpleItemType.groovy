package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class SimpleItemType {
	boolean AutoPay;
	boolean AvailableForPickupDropOff;
	boolean BestOfferEnabled;
	int BidCount;
	BusinessSellerDetailsType BusinessSellerDetails;
	boolean BuyItNowAvailable;
	AmountType BuyItNowPrice;
	CharityType Charity;
	String ConditionDescription;
	String ConditionDisplayName;
	int ConditionID;
	AmountType ConvertedBuyItNowPrice;
	AmountType ConvertedCurrentPrice;
	CountryCodeType Country;
	AmountType CurrentPrice;
	String Description;
	DiscountPriceInfoType DiscountPriceInfo;
	DistanceType DistanceFromBuyer;
	boolean eBayNowAvailable;
	boolean eBayNowEligible;
	boolean EligibleForPickupDropOff;
	Date EndTime;
	List<String> ExcludeShipToLocation;
	URL GalleryURL;
	boolean GermanMotorsSearchable;
	boolean GetItFast;
	boolean Gift;
	boolean GlobalShipping;
	HalfItemConditionCodeType HalfItemCondition;
	int HandlingTime;
	SimpleUserType HighBidder;
	long HitCount;
	boolean IgnoreQuantity;
	boolean IntegratedMerchantCreditCardEnabled;
	int ItemCompatibilityCount;
	ItemCompatibilityListType ItemCompatibilityList;
	String ItemID;
	NameValueListArrayType ItemSpecifics;
	ListingStatusCodeType ListingStatus;
	ListingTypeCodeType ListingType;
	String Location;
	int LotSize;
	AmountType MinimumToBid;
	boolean NewBestOffer;
	List<SiteCodeType> PaymentAllowedSite;
	List<BuyerPaymentMethodCodeType> PaymentMethods;
	boolean PictureExists;
	List<URL> PictureURL;
	String PostalCode;
	String PrimaryCategoryID;
	String PrimaryCategoryIDPath;
	String PrimaryCategoryName;
	ProductIDType ProductID;
	int Quantity;
	QuantityAvailableHintCodeType QuantityAvailableHint;
	QuantityInfo QuantityInfo;
	int QuantitySold;
	int QuantitySoldByPickupInStore;
	int QuantityThreshold;
	boolean RecentListing;
	boolean ReserveMet;
	ReturnPolicyType ReturnPolicy;
	String SecondaryCategoryID;
	String SecondaryCategoryIDPath;
	String SecondaryCategoryName;
	SimpleUserType Seller;
	String SellerComments;
	ShippingCostSummaryType ShippingCostSummary;
	List<String> ShipToLocations;
	SiteCodeType Site;
	String SKU;
	Date StartTime;
	StorefrontType Storefront;
	String Subtitle;
	String TimeLeft;
	String Title;
	boolean TopRatedListing;
	UnitInfoType UnitInfo;
	VariationsType Variations;
	boolean VhrAvailable;
	URL VhrUrl;
	URL ViewItemURLForNaturalSearch;
	int WatchCount;
}
