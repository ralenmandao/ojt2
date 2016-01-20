package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.*
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ErrorData {
	ErrorCategory category;
	String domain;
	long errorId;
	String exceptionId;
	String message;
	ErrorParameter parameter;
	ErrorSeverity severity;
	String subdomain;
}
