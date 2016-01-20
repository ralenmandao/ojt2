package com.ralen.helper.sample.ebay;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;

import com.ralen.helper.builder.Mapper;
import com.ralen.helper.util.Util;

public class EbayTypesMapper implements Mapper{

	@Override
	public List<String> getURI(Document doc) {
		String url = doc.baseUri().replace("index.html", "types");
		List<String> type = new ArrayList<>();
		type.add(url);
		return type;
	}

}
