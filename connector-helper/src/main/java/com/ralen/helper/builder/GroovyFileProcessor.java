package com.ralen.helper.builder;

import com.ralen.helper.util.GroovyFile;

public interface GroovyFileProcessor {
	public void process(GroovyFile file, DataTypeResolver resolver, String parentFolder);
	public DataTypeResolver getTypeResolver();
}
