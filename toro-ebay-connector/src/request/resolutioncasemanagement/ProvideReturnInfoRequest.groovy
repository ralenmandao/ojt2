package io.toro.ebay.model.resolutioncasemanagement

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.Address
import io.toro.ebay.model.CaseIdType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'ProvideReturnInfoRequest')
public class ProvideReturnInfoRequest {
	Address address
	CaseIdType caseId
	String returnMerchandiseAuthorization
}
