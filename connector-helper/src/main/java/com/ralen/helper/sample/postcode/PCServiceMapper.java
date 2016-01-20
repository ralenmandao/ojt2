package com.ralen.helper.sample.postcode;

import java.util.List;

import org.jsoup.nodes.Document;

import com.ralen.helper.builder.ServiceMapper;
import com.ralen.helper.util.Util;

public class PCServiceMapper implements ServiceMapper{

	@Override
	public List<String> getURI(Document doc) {
		List<String> ser = Util.elementsToUrlList(doc.select(".warrow"), "https://www.pcapredict.com");
		return ser;
	}

	@Override
	public String getServiceName(Document doc) {
		return doc.baseUri().split("/")[6];
	}

}
