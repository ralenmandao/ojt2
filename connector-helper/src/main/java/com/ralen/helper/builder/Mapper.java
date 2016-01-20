package com.ralen.helper.builder;

import java.util.List;

import org.jsoup.nodes.Document;

public interface Mapper {
	public List<String> getURI(Document doc);
}
