package com.ralen.helper.model

/**
 * Characteristic of an item in a category. For example, "Shoes Size" or "Style" might be aspects of the Men's
 * Shoes category, while "Genre" and "Album Type" could be aspects of the Music CDs category. This container is
 * not returned if there are no matching aspects for the category.
 */
public class Aspect {
	/**
	 * Container that returns the name of the respective aspect value and the histogram (the number of available
	 * items) that share that item characteristic. This value is not returned if there are no matching aspects for
	 * the category.
	 */
	AspectValueHistogram valueHistogram
	/**
	 * Name of an aspect that is part of a category. For example, "Optical Zoom" or "Megapixels" could be aspects of
	 * the Digital Cameras category. For the current aspect names associated with a specific item, refer to the
	 * aspectHistogramContainer returned for the respective item. This value is not returned if there are no matching
	 * aspects for the category.
	 */
	String name
}
