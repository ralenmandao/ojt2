package com.ralen.helper.builder;

import org.jsoup.nodes.Document;

public interface ServiceMapper extends Mapper{
	public String getServiceName(Document doc);
}
