package com.ralen.helper.util;

import java.util.HashMap;
import java.util.Map;

public class Field {
	private String name;
	private String type;
	private String documentation;
	private boolean isAttribute;
	private boolean isList;
	
	public Field(String name, String type){
		this.name = name;
		this.type = type;
		isAttribute = false;
		isList = false;
	}

	public boolean isAttribute() {
		return isAttribute;
	}

	public boolean isList() {
		return isList;
	}

	public void setList(boolean isList) {
		this.isList = isList;
	}

	public void setAttribute(boolean isAttribute) {
		this.isAttribute = isAttribute;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDocumentation() {
		return documentation;
	}


	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	
	
}
