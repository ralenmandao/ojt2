package com.ralen.helper.util;

import java.util.ArrayList;
import java.util.List;

import com.ralen.helper.builder.DataTypeResolver;
import com.ralen.helper.builder.DefaultDataTypeResolver;
import com.ralen.helper.builder.GroovyFileProcessor;

public class GroovyFile {
	private String basePackage;
	private List<Field> fields;
	private String name;
	private List<String> imports;
	private boolean isEnumeration;
	private String documentation;
	
	public GroovyFile(String name){
		fields = new ArrayList<>();
		this.name = name;
	}

	public List<Field> getFields() {
		return fields;
	}

	public boolean isEnumeration() {
		return isEnumeration;
	}

	public void setEnumeration(boolean isEnumeration) {
		this.isEnumeration = isEnumeration;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	public String getBasePackage() {
		return basePackage;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}
	
	public void addField(Field field){
		fields.add(field);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getImports() {
		return imports;
	}

	public void setImports(List<String> imports) {
		this.imports = imports;
	}
	
	public void create(GroovyFileProcessor creator, String parent){
		creator.process(this, new DefaultDataTypeResolver(), parent);
	}
	
	public void create(GroovyFileProcessor creator, DataTypeResolver resolver, String parent){
		creator.process(this, resolver, parent);
	}
	
	public void create(GroovyFileProcessor creator){
		creator.process(this, new DefaultDataTypeResolver(), "");
	}

	public void test(){
//		System.out.println(name);
//		for(Entry<String, String> e : attributes.entrySet()){
//			System.out.println("\t" + e.getValue() + " " + e.getKey());
//		}
	}
}
