package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class FindProductsRequestType {
	boolean AvailableItemsOnly;
	String CategoryID;
	List<String> DomainName;
	boolean HideDuplicateItems;
	String IncludeSelector;
	int MaxEntries;
	int PageNumber;
	ProductIDType ProductID;
	ProductSortCodeType ProductSort;
	String QueryKeywords;
	SortOrderCodeType SortOrder;
}
