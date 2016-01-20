package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class CharacteristicType {
	int AttributeID;
	String DateFormat;
	String DisplaySequence;
	String DisplayUOM;
	LabelType Label;
	SortOrderCodeType SortOrder;
	List<ValType> ValueList;
}
