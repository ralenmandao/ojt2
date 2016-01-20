package io.toro.ebay.model.feedback

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.TransactionKey
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'CreateDSRSummaryByTransactionRequest')
public class CreateDSRSummaryByTransactionRequest {
	List<TransactionKey> transactionKey
}
