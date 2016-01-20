package com.ralen.helper.sample.ebay;

import java.util.Map;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.ralen.helper.builder.ElementProcessor;
import com.ralen.helper.util.Field;

public class EbaySingleClassProcessor implements ElementProcessor {

	@Override
	public Field process(Element element, Map<String, String> params) {
		if (params.containsKey("enumStruc")) {
			String name = element.select("td:first-child").first().text();
			String type = element.select("td:nth-child(2) b a").first().text();
			String desc = element.select("td:nth-child(2)").first().ownText();
			Field field = new Field(name, type);
			field.setDocumentation(desc);
			return field;
		} else if(params.containsKey("enum")){
			String name = element.select("td:first-child").first().text();
			String doc = element.select("td:nth-child(2)").first().ownText();
			Field field = new Field(name, null);
			field.setDocumentation(doc);
			return field;
		} else {
			String elementID = element.select(".elementID").first().text();
			String elementDetails = element.select(".elementDetails > .elementDefn").first().text();

			String tokens[] = elementID.replace(" ", "").split("\\(");
			String typeTokens[] = tokens[1].split("\\)");

			String name = tokens[0];
			String type = typeTokens[0];

			boolean isList = false;
			if (typeTokens.length > 1) {
				isList = typeTokens[1].contains("[");
			}

			boolean isAttribute = false;
			if (element.dataset().containsKey("type")) {
				System.out.println(element.dataset().get("type"));
				isAttribute = element.dataset().get("type").equals("attr");
			}

			Field field = new Field(name, type);
			field.setAttribute(isAttribute);
			field.setList(isList);
			field.setDocumentation(elementDetails);

			return field;
		}
	}

	@Override
	public boolean isValid(Element element) {
		return true;
	}

}
