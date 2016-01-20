package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class TransactionStatusType {
	boolean BuyerSelectedShipping;
	CheckoutStatusCodeType CheckoutStatus;
	CompleteStatusCodeType CompleteStatus;
	DigitalStatusCodeType DigitalStatus;
	PaymentStatusCodeType eBayPaymentStatus;
	InquiryStatusCodeType InquiryStatus;
	boolean IntegratedMerchantCreditCardEnabled;
	Date LastTimeModified;
	PaymentHoldStatusCodeType PaymentHoldStatus;
	BuyerPaymentInstrumentCodeType PaymentInstrument;
	BuyerPaymentMethodCodeType PaymentMethodUsed;
	ReturnStatusCodeType ReturnStatus;
}
