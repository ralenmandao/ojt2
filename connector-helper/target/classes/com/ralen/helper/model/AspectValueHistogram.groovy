package com.ralen.helper.model

/**
 * Container for details pertaining to individual aspect values, including their histogram information (item
 * counts).
 */
public class AspectValueHistogram {
	/**
	 * Number of items that share the characteristic the respective aspect value.
	 */
	long count
	/**
	 * Name of an aspect value. For example, "Short Sleeve" could be an aspect value of the Sleeve Style aspect in
	 * the Women's Dresses category, or "Athletic" could be an aspect value of the Style aspect in the Men's Shoes
	 * category.
	 */
	String valueName
}
