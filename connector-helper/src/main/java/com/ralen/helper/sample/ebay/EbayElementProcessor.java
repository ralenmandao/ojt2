package com.ralen.helper.sample.ebay;

import java.util.Map;

import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ralen.helper.builder.ElementProcessor;
import com.ralen.helper.util.Field;
import com.ralen.helper.util.GroovyFile;
import com.ralen.helper.util.Util;

public class EbayElementProcessor implements ElementProcessor{
	
	private static final Logger logger = LoggerFactory.getLogger(EbayElementProcessor.class);
	
	@Override
	public Field process(Element element, Map<String, String> params) {
		String name = element.select("td:first-child").text();
		String type = element.select("td:nth-child(2) a:first-child").first().ownText();
		String doc = element.select("td:nth-child(4)").first().ownText();
		
		Field field = new Field(name, type);
		field.setDocumentation(doc);
		return field;
	}

	@Override
	public boolean isValid(Element element) {
		String name = element.select("td:first-child").text();
		String type = element.select("td:nth-child(2)").text();
		
		if(name.contains("-") || name.contains(" ") || name.contains(".")) return false;
		if(type.contains("-") || type.contains(" ") || type.contains(".")) return false;
		
		return true;
	}
	
	
}
	