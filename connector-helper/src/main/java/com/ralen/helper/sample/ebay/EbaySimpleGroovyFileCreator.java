package com.ralen.helper.sample.ebay;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.commons.lang3.text.WordUtils;

import com.ralen.helper.builder.DataTypeResolver;
import com.ralen.helper.builder.GroovyFileProcessor;
import com.ralen.helper.util.Field;
import com.ralen.helper.util.GroovyFile;

public class EbaySimpleGroovyFileCreator implements GroovyFileProcessor{

	@Override
	public void process(GroovyFile gf, DataTypeResolver resolver, String parent) {
		String folder = parent + gf.getBasePackage().replace(".", "/").concat("/");
		new File(folder).mkdir();
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(folder + WordUtils.capitalize(gf.getName()) + ".groovy"));
			pw.println("package " + gf.getBasePackage() + "\n");
			pw.println(formatDocumentation(gf.getDocumentation(), ""));
			pw.println("public " + (gf.isEnumeration() ? "enum " : "class ") + WordUtils.capitalize(gf.getName()) + " {");
			Iterator<Field> i = gf.getFields().iterator();
			while(i.hasNext()){
				Field field = i.next();
				if(gf.isEnumeration()){
					pw.println(formatDocumentation(field.getDocumentation(), "\t"));
					pw.println("\t" + WordUtils.capitalizeFully(field.getName()) + (i.hasNext() ? "," : ""));
				}else{
					pw.println(formatDocumentation(field.getDocumentation(), "\t"));
					pw.println("\t" + resolver.resolve(field.getType()) + " " + field.getName());
				}
			}
			pw.println("}");
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public DataTypeResolver getTypeResolver() {
		return new EbayDataTypeResolver();
	}
	
	private String formatDocumentation(String doc, String app){
		StringBuilder sb = new StringBuilder();
		String newDoc = WordUtils.wrap(doc, 110);
		sb.append(app + "/**");
		Arrays.stream(newDoc.split("\\r?\\n")).forEach(line -> sb.append("\n" + app + " * " + line));
		sb.append("\n" + app + " */");
		return sb.toString() ;
	}

}
