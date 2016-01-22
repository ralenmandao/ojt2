package io.toro.boot.parser

import groovy.util.slurpersupport.GPathResult;

class WSDLParser {
	
	/* Result of the parse WSDL */
	GPathResult res
	
	WSDLParser(String wsdl){
		res = new XmlSlurper().parse(wsdl);
	}
	
	GPathResult getData(){
		res
	}
}
