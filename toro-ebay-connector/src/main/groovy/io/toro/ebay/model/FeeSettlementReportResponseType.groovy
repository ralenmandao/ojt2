package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class FeeSettlementReportResponseType {
	String AccountID;
	List<AccountTransactionType> AccountTransactionList;
	List<AccountTransactionType> DiscountTransactionList;
	AmountType FeeRoundingAdjustmentAmount;
	AmountType FeeSettlementAmount;
	AmountType FeeTotalUsageAdjustmentAmount;
	String InvoiceID;
	Date InvoiceProcessingTime;
	AmountType LastInvoiceAmount;
	List<TransactionListType> ListingTransactionList;
	List<OrderDetailsType> OrderAdjustmentList;
	List<OrderDetailsType> OrderTransactionList;
	Date ReportEndTime;
	Date ReportProcessingTime;
	Date ReportStartTime;
	String SellerID;
}
