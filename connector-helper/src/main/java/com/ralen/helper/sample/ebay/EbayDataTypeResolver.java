package com.ralen.helper.sample.ebay;

import com.ralen.helper.builder.DataTypeResolver;

public class EbayDataTypeResolver implements DataTypeResolver{

	@Override
	public String resolve(String type) {
		if(type.equals("string") || type.equals("token")){
			return "String";
		}
		return type;
	}
	
}
