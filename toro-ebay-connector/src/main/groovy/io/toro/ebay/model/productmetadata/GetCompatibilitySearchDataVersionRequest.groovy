package io.toro.ebay.model.productmetadata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetCompatibilitySearchDataVersionRequest')
public class GetCompatibilitySearchDataVersionRequest {
	String categoryId
}
