package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ErrorType {
	ErrorClassificationCodeType ErrorClassification;
	String ErrorCode;
	List<ErrorParameterType> ErrorParameters;
	String LongMessage;
	SeverityCodeType SeverityCode;
	String ShortMessage;
	boolean UserDisplayHint;
}
