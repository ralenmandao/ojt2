package com.ralen.helper.model

/**
 * Controls the pagination of the result set. Child elements specify the maximum number of item listings to
 * return per call and which page of data to return. Controls which listings are returned in the response, but
 * does not control the details associated with the returned items.
 */
public class PaginationInput {
	/**
	 * Specifies the maximum number of entries to return in a single call. If the number of entries found on the
	 * specified pageNumber is less than the value specified here, the number of items returned will be less than the
	 * value of entriesPerPage. This indicates the end of the result set. If entriesPerPage is set to a number
	 * greater than 100, the default value, 100, will be used.
	 */
	int entriesPerPage
	/**
	 * Specifies which subset of data (or "page") to return in the call response. The number of data pages is
	 * determined by the total number of items matching the request search criteria (returned in
	 * paginationOutput.totalEntries) divided by the number of entries to display in each response (entriesPerPage).
	 * You can return up to the first 100 pages of the result set by issuing multiple requests and specifying, in
	 * sequence, the pages to return.
	 */
	int pageNumber
}
