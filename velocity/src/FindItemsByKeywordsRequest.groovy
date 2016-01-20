package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.*
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class FindItemsByKeywordsRequest {
	List<AspectFilter> aspectFilter;
	List<DomainFilter> domainFilter;
	List<ItemFilter> itemFilter;
	String keywords;
	List<OutputSelectorType> outputSelector;
}
