package com.ralen.helper.builder;

import org.jsoup.nodes.Document;

import com.ralen.helper.util.FetchResult;

public interface Fetcher {
	public FetchResult fetch(Document doc);
	public String getName(Document doc);
	public boolean isEnumeration(Document doc);
	public String getDocumentation(Document doc);
}
