package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ProductRequest {
	String categoryId;
	List<String> dataset;
	List<String> datasetPropertyName;
	String invocationId;
	String keywords;
	PaginationInput paginationInput;
	ProductStatus productStatusFilter;
	List<PropertyValue> propertyFilter;
	SortOrder sortOrder;
}
