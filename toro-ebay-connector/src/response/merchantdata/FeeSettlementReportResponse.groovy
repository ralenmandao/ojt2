package io.toro.ebay.model.merchantdata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.AccountTransactionType
import io.toro.ebay.model.AccountTransactionType
import io.toro.ebay.model.AmountType
import io.toro.ebay.model.AmountType
import io.toro.ebay.model.AmountType
import io.toro.ebay.model.AmountType
import io.toro.ebay.model.TransactionListType
import io.toro.ebay.model.OrderDetailsType
import io.toro.ebay.model.OrderDetailsType
import io.toro.ebay.model.AckCodeType
import io.toro.ebay.model.ErrorType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FeeSettlementReportResponse')
public class FeeSettlementReportResponse {
	String AccountID
	List<AccountTransactionType> AccountTransactionList
	List<AccountTransactionType> DiscountTransactionList
	AmountType FeeRoundingAdjustmentAmount
	AmountType FeeSettlementAmount
	AmountType FeeTotalUsageAdjustmentAmount
	String InvoiceID
	String InvoiceProcessingTime
	AmountType LastInvoiceAmount
	List<TransactionListType> ListingTransactionList
	List<OrderDetailsType> OrderAdjustmentList
	List<OrderDetailsType> OrderTransactionList
	String ReportEndTime
	String ReportProcessingTime
	String ReportStartTime
	String SellerID
	AckCodeType Ack
	String Build
	String CorrelationID
	List<ErrorType> Errors
	String HardExpirationWarning
	String Timestamp
	String Version
}
