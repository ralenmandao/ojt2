package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.*
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class FindItemsByProductRequest {
	List<ItemFilter> itemFilter;
	List<OutputSelectorType> outputSelector;
	ProductId productId;
}
