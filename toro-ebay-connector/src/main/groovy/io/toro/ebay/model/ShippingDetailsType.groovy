package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ShippingDetailsType {
	boolean AllowPaymentEdit;
	boolean ApplyShippingDiscount;
	CalculatedShippingDiscountType CalculatedShippingDiscount;
	CalculatedShippingRateType CalculatedShippingRate;
	boolean ChangePaymentInstructions;
	AmountType CODCost;
	AmountType DefaultShippingCost;
	List<String> ExcludeShipToLocation;
	FlatShippingDiscountType FlatShippingDiscount;
	boolean GetItFast;
	boolean GlobalShipping;
	InsuranceDetailsType InsuranceDetails;
	AmountType InsuranceFee;
	InsuranceOptionCodeType InsuranceOption;
	boolean InsuranceWanted;
	CalculatedShippingDiscountType InternationalCalculatedShippingDiscount;
	FlatShippingDiscountType InternationalFlatShippingDiscount;
	InsuranceDetailsType InternationalInsuranceDetails;
	boolean InternationalPromotionalShippingDiscount;
	String InternationalShippingDiscountProfileID;
	List<InternationalShippingServiceOptionsType> InternationalShippingServiceOption;
	boolean PaymentEdited;
	String PaymentInstructions;
	boolean PromotionalShippingDiscount;
	PromotionalShippingDiscountDetailsType PromotionalShippingDiscountDetails;
	RateTableDetailsType RateTableDetails;
	SalesTaxType SalesTax;
	boolean SellerExcludeShipToLocationsPreference;
	int SellingManagerSalesRecordNumber;
	List<ShipmentTrackingDetailsType> ShipmentTrackingDetails;
	String ShippingDiscountProfileID;
	String ShippingRateErrorMessage;
	ShippingRateTypeCodeType ShippingRateType;
	List<ShippingServiceOptionsType> ShippingServiceOptions;
	String ShippingServiceUsed;
	ShippingTypeCodeType ShippingType;
	TaxTableType TaxTable;
	boolean ThirdPartyCheckout;
}
