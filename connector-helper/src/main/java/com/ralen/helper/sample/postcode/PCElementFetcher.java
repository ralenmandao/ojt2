package com.ralen.helper.sample.postcode;

import org.apache.commons.lang3.text.WordUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.ralen.helper.builder.Fetcher;
import com.ralen.helper.util.FetchResult;

public class PCElementFetcher implements Fetcher {

	@Override
	public FetchResult fetch(Document doc) {
		FetchResult result = new FetchResult();
		Element e = doc.getElementsContainingOwnText("Parameters").not("*:not(h2)").first();
		int index = e.elementSiblingIndex();
		Element es = doc.select(".doc-table:gt(" + index + ")").first();
		result.setElements(es.select("tr:nth-child(n+1)"));
		return result;
	}

	@Override
	public String getName(Document doc) {
		String name = doc.select("#body > section > div.content-wrapper.container-fluid > div > div.span9 > h1")
							.first().ownText();
		name = WordUtils.capitalize(name).replace(" ", "").split("\\(")[0];
		return name;
	}

	@Override
	public boolean isEnumeration(Document doc) {
		return false;
	}

	@Override
	public String getDocumentation(Document doc) {
		return doc.select("#body > section > div.content-wrapper.container-fluid > div > div.span9 > p")
				.first().ownText();
	}

}
