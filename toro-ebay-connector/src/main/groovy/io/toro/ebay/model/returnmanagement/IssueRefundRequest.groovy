package io.toro.ebay.model.returnmanagement

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.RefundDetailType
import io.toro.ebay.model.ReturnIdType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'IssueRefundRequest')
public class IssueRefundRequest {
	String comments
	RefundDetailType refundDetail
	ReturnIdType ReturnId
}
