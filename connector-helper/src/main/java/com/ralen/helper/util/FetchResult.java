package com.ralen.helper.util;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.select.Elements;

public class FetchResult {
	private Elements elements;
	private Map<String, String> params;
	
	public FetchResult(){
		elements = new Elements();
		params = new HashMap<>();
	}
	
	public FetchResult(Elements elements){
		this.elements = elements;
		params = new HashMap<>();
	}
	
	public void addParam(String key, String value){
		params.put(key, value);
	}
	
	public Elements getElements() {
		return elements;
	}
	public void setElements(Elements elements) {
		this.elements = elements;
	}
	public Map<String, String> getParams() {
		return params;
	}
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
}
