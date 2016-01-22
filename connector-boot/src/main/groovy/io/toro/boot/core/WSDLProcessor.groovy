package io.toro.boot.core

import groovy.util.slurpersupport.GPathResult
import io.toro.boot.parser.WSDLParser

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class WSDLProcessor {
	
	WSDLParser parser
	GPathResult service
	GPathResult ports
	GPathResult port
	static final Logger logger = LoggerFactory.getLogger(WSDLProcessor)
	
	WSDLProcessor(){
		parser = new WSDLParser("http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL");
	}
	
	void build(){
		service = parser.data.service
		if(service == null){
			logger.error('no service found')
			return;
		}else if(service.size() > 1) logger.info('Wsdl contains too many services')
		ports = service.port
		if(ports == null){
			logger.error('no ports found')
			return;
		}else if(ports.size() > 1) {
			logger.warn('Wsdl too many ports')
			("0..${ports.size()}").each{
				println "${it} ${port.getProperty(/@binding)}"
			}
		}
	}
}
