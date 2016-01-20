package io.toro.ebay.model.resolutioncasemanagement

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.CaseIdType
import io.toro.ebay.model.UploadDocumentInfoType
import io.toro.ebay.model.ProofType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'UploadDocumentsRequest')
public class UploadDocumentsRequest {
	CaseIdType caseId
	List<UploadDocumentInfoType> document
	ProofType proofType
}
