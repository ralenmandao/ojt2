package com.ralen;

import java.util.regex.Pattern;

public class Sample {
	public static void main(String[] args){
		String lol = "awe, awe";
		System.out.println(Pattern.compile("(\\w+),(\\w+)").matcher(lol).find());
		Pattern.compile("stores.*store.*product").matcher(lol).find();
	}
}
