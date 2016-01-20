package com.ralen.helper.util;

import java.util.HashMap;
import java.util.Map;

public class Service {
	private String service;
	private String url;
	private Map<String, String> calls;
	
	public Service(String name, String url) {
		this.service = name;
		this.url = url;
		calls = new HashMap<>();
	}
	
	public void add(String name, String url){
		calls.put(name, url);
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, String> getCalls() {
		return calls;
	}

	public void setCalls(Map<String, String> calls) {
		this.calls = calls;
	}
}
