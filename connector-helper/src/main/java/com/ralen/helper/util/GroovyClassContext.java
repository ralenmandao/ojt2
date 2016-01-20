package com.ralen.helper.util;

import java.util.HashMap;
import java.util.Map;

public class GroovyClassContext {
	private Map<String, GroovyFile> files;
	
	public GroovyClassContext(){
		files = new HashMap<>();
	}
	
	public void add(String name, GroovyFile file){
		files.put(name, file);
	}
	
	public int size(){
		return files.size();
	}
	
	public Map<String, GroovyFile> getFiles(){
		return files;
	}
}
