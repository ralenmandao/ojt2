package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class TransactionType {
	AmountType ActualHandlingCost;
	AmountType ActualShippingCost;
	AmountType AdjustmentAmount;
	AmountType AmountPaid;
	boolean BestOfferSale;
	boolean BundlePurchase;
	UserType Buyer;
	String BuyerCheckoutMessage;
	AmountType BuyerGuaranteePrice;
	String BuyerMessage;
	BuyerPackageEnclosuresType BuyerPackageEnclosures;
	PaidStatusCodeType BuyerPaidStatus;
	String CartID;
	String CodiceFiscale;
	OrderType ContainingOrder;
	AmountType ConvertedAdjustmentAmount;
	AmountType ConvertedAmountPaid;
	AmountType ConvertedTransactionPrice;
	Date CreatedDate;
	DepositTypeCodeType DepositType;
	DigitalDeliverySelectedType DigitalDeliverySelected;
	AmountType DutchAuctionBid;
	boolean eBayPlusTransaction;
	String ExtendedOrderID;
	List<ExternalTransactionType> ExternalTransaction;
	FeedbackInfoType FeedbackLeft;
	FeedbackInfoType FeedbackReceived;
	AmountType FinalValueFee;
	boolean Gift;
	GiftSummaryType GiftSummary;
	boolean IntangibleItem;
	String InventoryReservationID;
	Date InvoiceSentTime;
	boolean IsMultiLegShipping;
	ItemType Item;
	ListingCheckoutRedirectPreferenceType ListingCheckoutRedirectPreference;
	String LogisticsPlanType;
	PaymentsInformationType MonetaryDetails;
	MultiLegShippingDetailsType MultiLegShippingDetails;
	String OrderLineItemID;
	Date PaidTime;
	String PaisaPayID;
	PaymentHoldDetailType PaymentHoldDetails;
	String PayPalEmailAddress;
	PickupDetailsType PickupDetails;
	PickupMethodSelectedType PickupMethodSelected;
	TransactionPlatformCodeType Platform;
	int QuantityPurchased;
	AmountType RefundAmount;
	RefundArrayType RefundArray;
	String RefundStatus;
	boolean SellerContactBuyerByEmail;
	SellerDiscountsType SellerDiscounts;
	PaidStatusCodeType SellerPaidStatus;
	SellingManagerProductDetailsType SellingManagerProductDetails;
	Date ShippedTime;
	AmountType ShippingConvenienceCharge;
	ShippingDetailsType ShippingDetails;
	ShippingServiceOptionsType ShippingServiceSelected;
	TaxesType Taxes;
	AmountType TotalPrice;
	String TransactionID;
	AmountType TransactionPrice;
	SiteCodeType TransactionSiteID;
	UnpaidItemType UnpaidItem;
	VariationType Variation;
	double VATPercent;
}
