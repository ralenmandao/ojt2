package com.ralen.helper.model

/**
 * Container for a top-level set of aspect histograms.
 */
public class AspectHistogramContainer {
	/**
	 * A characteristic of an item in a category. For example, "Optical Zoom", "Brand", and "Megapixels" could be
	 * aspects of the Digital Cameras category. Aspects are well-known, standardized characteristics of a category,
	 * and they vary from category to category (the aspects of "Men's Shoes" are different from those of "Digital
	 * Cameras"). A search request on the eBay site will often display aspects and their respective aspect values on
	 * the left-had side of a query response. Aspects are extracted from item listing properties (such as item titles
	 * and subtitles), and represent the characteristics of active items. Values returned in the Aspect container can
	 * be used as inputs to the aspectFilter fields in a query to distill the items returned by the query. eBay
	 * generates aspects dynamically from the items currently listed; aspects provide a view into what is currently
	 * available on eBay. Because of this, aspect values returned one day cannot be guaranteed to be valid the next
	 * day. The following graphic shows how eBay might return a set of aspects for the Digital Cameras category. In
	 * this graphic, "Product Type", "Brand", and "Megapixels" are aspects, and "Point & Shoot", "Canon", and "12.0
	 * to 12.9 MP" are aspect values. Histogram values (item counts) are shown for each aspect value.
	 */
	Aspect aspect
	/**
	 * Not used by any call. As of October 2014, this field will no longer be returned.
	 */
	String domainDisplayName
	/**
	 * Not used by any call. As of October 2014, this field will no longer be returned.
	 */
	String domainName
}
