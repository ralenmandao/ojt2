package com.ralen.helper.model

/**
 * Statistical (histogram) information about categories that contain items that match the query, if any. For
 * categories associated with specific items, see items returned in each search result. Shows the distribution of
 * items across each category. Not returned if there is no match.
 */
public class CategoryHistogram {
	/**
	 * Container for histogram information pertaining to a child of the category specified in the request. Histograms
	 * return data on up to 10 children. Histograms are only a single level deep. That is, a given category histogram
	 * contains only immediate children.
	 */
	CategoryHistogram childCategoryHistogram
	/**
	 * The total number of items in the associated category that match the search criteria.
	 */
	long count
}
