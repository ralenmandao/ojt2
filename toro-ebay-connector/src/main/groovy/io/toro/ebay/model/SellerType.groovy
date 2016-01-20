package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class SellerType {
	boolean AllowPaymentEdit;
	CurrencyCodeType BillingCurrency;
	CharityAffiliationDetailsType CharityAffiliationDetails;
	boolean CharityRegistered;
	boolean CheckoutEnabled;
	boolean CIPBankAccountStored;
	boolean DomesticRateTable;
	FeatureEligibilityType FeatureEligibility;
	boolean GoodStanding;
	IntegratedMerchantCreditCardInfoType IntegratedMerchantCreditCardInfo;
	boolean InternationalRateTable;
	MerchandizingPrefCodeType MerchandizingPref;
	int PaisaPayEscrowEMIStatus;
	int PaisaPayStatus;
	SellerPaymentMethodCodeType PaymentMethod;
	ProStoresCheckoutPreferenceType ProStoresPreference;
	boolean QualifiesForB2BVAT;
	RecoupmentPolicyConsentType RecoupmentPolicyConsent;
	boolean RegisteredBusinessSeller;
	boolean SafePaymentExempt;
	SchedulingInfoType SchedulingInfo;
	SellerBusinessCodeType SellerBusinessType;
	SellereBayPaymentProcessConsentCodeType SellereBayPaymentProcessConsent;
	SellereBayPaymentProcessStatusCodeType SellereBayPaymentProcessStatus;
	SellerGuaranteeLevelCodeType SellerGuaranteeLevel;
	SellerLevelCodeType SellerLevel;
	AddressType SellerPaymentAddress;
	boolean StoreOwner;
	SiteCodeType StoreSite;
	URL StoreURL;
	boolean TopRatedSeller;
	TopRatedSellerDetailsType TopRatedSellerDetails;
	float TransactionPercent;
}
