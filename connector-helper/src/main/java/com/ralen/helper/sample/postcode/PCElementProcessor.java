package com.ralen.helper.sample.postcode;

import java.util.Map;

import org.jsoup.nodes.Element;

import com.ralen.helper.builder.ElementProcessor;
import com.ralen.helper.util.Field;

public class PCElementProcessor implements ElementProcessor{

	@Override
	public Field process(Element element, Map<String, String> params) {
		String name = element.select("td:first-child").text().replace(" ", "").replace("*", "");
		String type = element.select("td:nth-child(2)").text();
		String doc = element.select("td:nth-child(3)").text();
		Field field = new Field(name, type);
		field.setDocumentation(doc);
		return field;
	}

	@Override
	public boolean isValid(Element element) {
		return true;
	}

}
