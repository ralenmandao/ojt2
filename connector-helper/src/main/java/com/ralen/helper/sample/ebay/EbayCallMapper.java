package com.ralen.helper.sample.ebay;

import java.util.Iterator;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.ralen.helper.builder.CallMapper;
import com.ralen.helper.util.Util;

public class EbayCallMapper implements CallMapper{

	@Override
	public List<String> getURI(Document doc) {
		List<String> uri = Util.elementsToUrlList(doc.select("#doc > table > tbody > tr:nth-child(n+2) > td:nth-child(1) > a"));
		for(int x = 0 ; x < uri.size(); x++){
			uri.set(x, doc.baseUri().replace("index.html", "") + uri.get(x));
		}
		return uri;
	}

	@Override
	public String getCallName(Document doc) {
		return doc.select("#doc > h1").text();
	}

	@Override
	public boolean isDeprecated(Document doc) {
		Elements e = doc.select("#doc > p > b");
		if(e != null && e.size() > 0){
			System.out.println("Deprecated");
			return e.first().ownText().contains("deprecated");
		}else{
			return false;
		}
	}
}
