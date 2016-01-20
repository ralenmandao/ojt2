package com.ralen.helper.sample.trello;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.ralen.helper.builder.ServiceMapper;
import com.ralen.helper.util.Util;

public class TrelloServiceMapper implements ServiceMapper{

	@Override
	public List<String> getURI(Document doc) {
		
		Elements el = doc.select("body > main > div > div.api-ref-nav > ul > li:nth-child(1) > a");
		System.out.println("SIZE  @@@@@@@ - " + doc.baseUri());
		
		return Util.elementsToUrlList(doc.select("body > main > div > div.api-ref-nav > ul > li > a"));
	}

	@Override
	public String getServiceName(Document doc) {
		return doc.select("body > main > div > div.api-ref-nav > ul > li > a").text();
	}

}
