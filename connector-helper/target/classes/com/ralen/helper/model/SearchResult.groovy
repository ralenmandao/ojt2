package com.ralen.helper.model

/**
 * Contains the returned item listings, if any. The data for each listing is returned in individual item
 * containers.
 */
public class SearchResult {
	/**
	 * Container for the data of a single item that matches the search criteria.
	 */
	SearchItem item
	/**
	 * The total number of items returned in the search response. This is often equal to the entriesPerPage value. If
	 * the count is less than the specified entriesPerPage, it indicates the end of the result set.
	 */
	int count
}
