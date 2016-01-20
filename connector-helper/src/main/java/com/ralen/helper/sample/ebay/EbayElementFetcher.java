package com.ralen.helper.sample.ebay;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.ralen.helper.builder.Fetcher;
import com.ralen.helper.util.FetchResult;

public class EbayElementFetcher implements Fetcher{

	private String baseTable;
	
	public EbayElementFetcher(String baseTable) {
		this.baseTable = baseTable;
	}
	
	@Override
	public String getName(Document doc) {
		return doc.select("#doc > h1").first().text().replace(" ", "").split("\\(")[0] + "Request";
	}

	@Override
	public FetchResult fetch(Document doc) {
		FetchResult result = new FetchResult(doc.select(baseTable + " tr:nth-child(n+1)"));
		return result;
	}

	@Override
	public boolean isEnumeration(Document doc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getDocumentation(Document doc) {
		// TODO Auto-generated method stub
		return doc.select("#doc > p:nth-child(4)").first().text();
	}
}
