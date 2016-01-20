package com.ralen.helper.builder;

import java.util.Map;

import org.jsoup.nodes.Element;

import com.ralen.helper.util.Field;

public interface ElementProcessor {
	public Field process(Element element, Map<String, String> params);
	public boolean isValid(Element element);
}
