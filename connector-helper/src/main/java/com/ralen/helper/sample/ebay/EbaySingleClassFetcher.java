package com.ralen.helper.sample.ebay;

import java.util.Map;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.ralen.helper.builder.Fetcher;
import com.ralen.helper.util.FetchResult;

public class EbaySingleClassFetcher implements Fetcher{

	@Override
	public FetchResult fetch(Document doc) {
		
		FetchResult result = new FetchResult();
		
		if(isEnumerationStruct(doc)){
			System.out.println("Im Enum like");
			result.addParam("enumStruc", "true");
			result.setElements(doc.select("#doc > table > tbody > tr:nth-child(n+2)"));
		}else if(isEnumeration(doc)){
			System.out.println("Im Enum");
			result.addParam("enum", "true");
			result.setElements(doc.select("#doc > table > tbody > tr:nth-child(n+2)"));
		}else{
			System.out.println("Regular ELem");
			Element e = doc.getElementsContainingOwnText("Attribute").not("*:not(h2)").first();
			if(e != null){
				int index = e.elementSiblingIndex();
				
				Elements fields = doc.select(".elementBlock:lt(" + index + ")");
				Elements attr = doc.select(".elementBlock:gt(" + index + ")");
				
				fields.forEach(f -> f.dataset().put("type", "field"));
				attr.forEach(a -> a.dataset().put("type", "attr"));
				fields.addAll(attr);
				
				result.setElements(fields);

			}else{
				result.setElements(doc.select(".elementBlock"));
			}
		}
		return result;
	}

	@Override
	public String getName(Document doc) {
		return doc.select("#doc > h1").first().text().replace(" ", "").split("\\(")[0];
	}
	
	public boolean isEnumerationStruct(Document doc){
		return doc.select("#doc > h2").first().text().contains("Enumeration") && doc.select(".defn_type").size() > 1;
	}
	
	@Override
	public boolean isEnumeration(Document doc){
		return doc.select("#doc > h2").first().text().contains("Enumeration") && doc.select(".defn_type").size() == 0;
	}

	@Override
	public String getDocumentation(Document doc) {
		return doc.select("#doc > p").first().text();
	}
}
