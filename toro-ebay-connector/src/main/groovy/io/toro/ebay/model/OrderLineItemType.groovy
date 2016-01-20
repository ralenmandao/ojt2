package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class OrderLineItemType {
	AmountType ActualShippingCost;
	String BuyerPaymentTransactionNumber;
	AmountType FeeAmount;
	String FeeDescription;
	String GlobalCategoryDescription;
	AmountType InsuranceCost;
	ItemIDType ItemID;
	String ItemTitle;
	int ListingSiteID;
	String Memo;
	String OrderLineItemID;
	Date OriginalChargeTime;
	Date PaymentClearedTime;
	int QuantitySold;
	AmountType SalePrice;
	Date SaleTime;
	String SecondDescription;
	int SellingManagerSaleRecordID;
	String SerialNumber;
	AmountType ShippingCost;
	String SiteDescription;
	SKUType SKU;
	TransactionStatusType Status;
	AmountType TaxAmount;
	String TaxCategory;
	TaxesType Taxes;
	AmountType TotalCost;
	Date TransactionTime;
	UnpaidItemType UnpaidItem;
	MerchantDataVariationType Variation;
}
