package com.ralen.helper.sample.ebay;

import java.util.List;

import org.jsoup.nodes.Document;

import com.ralen.helper.builder.ServiceMapper;
import com.ralen.helper.util.Util;

public class EbayServiceMapper implements ServiceMapper{

	@Override
	public List<String> getURI(Document doc) {
		List<String> uris = Util.elementsToUrlList(doc.getElementsMatchingOwnText("Call Reference"));
		String finder = uris.get(1);
		uris.clear();
		uris.add(finder);
		return uris;
	}

	@Override
	public String getServiceName(Document doc) {
		return doc.baseUri().split("/")[4];
	}

}
