package com.ralen.helper.builder;

public class DefaultDataTypeResolver implements DataTypeResolver{

	@Override
	public String resolve(String type) {
		return type;
	}

}
