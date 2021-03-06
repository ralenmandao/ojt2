package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.*
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class GetHistogramsResponse {
	AspectHistogramContainer aspectHistogramContainer;
	CategoryHistogramContainer categoryHistogramContainer;
	ConditionHistogramContainer conditionHistogramContainer;
	List<ExtensionType> extension;
}
