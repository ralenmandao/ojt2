package com.ralen.helper.sample.postcode;

import java.util.List;

import org.jsoup.nodes.Document;

import com.ralen.helper.builder.CallMapper;
import com.ralen.helper.util.Util;

public class PCCallMapper implements CallMapper {

	@Override
	public List<String> getURI(Document doc) {
		return Util.elementsToUrlList(
				doc.select("#body > section > div > div:nth-child(2) > div > table tr td:first-child a"),
				"https://www.pcapredict.com");
	}

	@Override
	public String getCallName(Document doc) {
		return doc.select("#body > section > div.content-wrapper.container-fluid > div > div.span9 > h1").text();
	}

	@Override
	public boolean isDeprecated(Document doc) {
		return false;
	}

}
