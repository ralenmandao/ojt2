package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class OrderDetailsType {
	String BuyerEmail;
	String BuyerFirstName;
	String BuyerLastName;
	String BuyerPhone;
	String BuyerStaticAlias;
	String BuyerUserID;
	int CheckoutSiteID;
	CheckoutStatusType CheckoutStatus;
	List<ExternalTransactionType> ExternalTransaction;
	AmountType InsuranceCost;
	Date OrderCreationTime;
	String OrderID;
	OrderItemDetailsType OrderItemDetails;
	AmountType OrderSalePrice;
	AmountType OrderTotalCost;
	Date PaymentClearedTime;
	PaymentHoldStatusCodeType PaymentHoldStatus;
	PickupDetailsType PickupDetails;
	PickupMethodSelectedType PickupMethodSelected;
	int SellingManagerSaleRecordID;
	String ShipCityName;
	String ShipCountryName;
	AmountType ShippingCost;
	String ShippingService;
	String ShippingServiceToken;
	String ShipPostalCode;
	String ShipRecipientName;
	String ShipReferenceId;
	String ShipStateOrProvince;
	String ShipStreet1;
	String ShipStreet2;
	AmountType TaxAmount;
}
