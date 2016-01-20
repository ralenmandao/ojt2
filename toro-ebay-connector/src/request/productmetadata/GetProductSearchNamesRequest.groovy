package io.toro.ebay.model.productmetadata

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetProductSearchNamesRequest')
public class GetProductSearchNamesRequest {
	String categoryId
	List<String> dataset
}
