package com.ralen.helper.model

/**
 * Use aspect filters to refine the number of results returned in a response. Populate the aspectFilter container
 * with aspect values obtained from the response of a query that returns an aspectHistogram.
 */
public class AspectFilter {
	/**
	 * Name of a standard item characteristic associated with a given category. For example, "Optical Zoom" or
	 * "Megapixels" are aspects for the Digital Cameras category. The current aspect names associated with a specific
	 * category can be found in the aspect histogram. Aspect histograms can be retrieved for a given keyword query or
	 * category. The aspect histogram contains information about aspects from the category that is most relevant to
	 * your search.
	 */
	String aspectName
	/**
	 * A value name for a given aspect. For example, "Point & Shoot" is a value name for the "Product Type" aspect in
	 * the "Digital Cameras" category.
	 */
	String aspectValueName
}
