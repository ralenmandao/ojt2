package com.ralen.helper.builder;

import org.jsoup.nodes.Document;

public interface CallMapper extends Mapper{
	public String getCallName(Document doc);
	public boolean isDeprecated(Document doc);
}
