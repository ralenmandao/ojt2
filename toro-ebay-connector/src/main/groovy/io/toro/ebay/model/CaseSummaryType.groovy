package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class CaseSummaryType {
	Amount caseAmount;
	CaseIdType caseId;
	int caseQuantity;
	Date creationDate;
	ItemType item;
	Date lastModifiedDate;
	CaseUserType otherParty;
	Date respondByDate;
	CaseStatusType status;
	CaseUserType user;
}
