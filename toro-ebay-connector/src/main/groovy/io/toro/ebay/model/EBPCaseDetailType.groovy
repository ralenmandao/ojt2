package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class EBPCaseDetailType {
	Amount agreedRefundAmount;
	List<AppealType> appeal;
	ShipmentType buyerReturnShipment;
	List<EBPCaseDocumentInfoType> caseDocumentInfo;
	CaseDecisionType decision;
	Date decisionDate;
	String decisionReason;
	DecisionReasonDetailType decisionReasonDetail;
	String detailStatus;
	DetailStatusInfoType detailStatusInfo;
	boolean FVFCredited;
	String globalId;
	String initialBuyerExpectation;
	InitialBuyerExpectationDetailType initialBuyerExpectationDetail;
	boolean notCountedInBuyerProtectionCases;
	String openReason;
	PaymentDetailType paymentDetail;
	List<EBPCaseResponseHistoryType> responseHistory;
	String returnMerchandiseAuthorization;
	ShipmentType sellerShipment;
}
