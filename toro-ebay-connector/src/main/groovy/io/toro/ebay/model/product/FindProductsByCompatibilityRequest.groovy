package io.toro.ebay.model.product

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.ProductByCompatibilityRequest
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FindProductsByCompatibilityRequest')
public class FindProductsByCompatibilityRequest {
	List<ProductByCompatibilityRequest> productByCompatibilitySearch
}
