package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class GetProductCompatibilitiesRequest {
	List<PropertyValue> applicationPropertyFilter;
	List<String> dataset;
	List<String> datasetPropertyName;
	ProductStatus disabledProductFilter;
	PaginationInput paginationInput;
	ProductIdentifier productIdentifier;
	List<CompatibilitySort> sortOrder;
}
