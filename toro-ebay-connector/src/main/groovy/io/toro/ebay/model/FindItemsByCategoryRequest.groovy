package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class FindItemsByCategoryRequest {
	List<AspectFilter> aspectFilter;
	List<String> categoryId;
	List<DomainFilter> domainFilter;
	List<ItemFilter> itemFilter;
	List<OutputSelectorType> outputSelector;
}
