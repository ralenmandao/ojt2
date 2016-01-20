package com.ralen.helper.model

/**
 * Shows the pagination data for the item search. Child elements include the page number returned, the maximum
 * entries returned per page, the total number of pages that can be returned, and the total number of items that
 * match the search criteria.
 */
public class PaginationOutput {
	/**
	 * The maximum number of items that can be returned in the response. This number is always equal to the value
	 * input for paginationInput.entriesPerPage. The end of the result set has been reached if the number specified
	 * for entriesPerPage is greater than the number of items found on the specified pageNumber. In this case, there
	 * will be fewer items returned than the number specified in entriesPerPage. This can be determined by comparing
	 * the entriesPerPage value with the value returned in the count attribute for the searchResult field.
	 */
	int entriesPerPage
	/**
	 * The subset of item data returned in the current response. Search results are divided into sets, or "pages," of
	 * item data. The number of pages is equal to the total number of items matching the search criteria divided by
	 * the value specified for entriesPerPage in the request. The response for a request contains one "page" of item
	 * data. This returned value indicates the page number of item data returned (a subset of the complete result
	 * set). If this field contains 1, the response contains the first page of item data (the default). If the value
	 * returned in totalEntries is less than the value for entriesPerPage, pageNumber returns 1 and the response
	 * contains the entire result set. The value of pageNumber is normally equal to the value input for
	 * paginationInput.pageNumber. However, if the number input for pageNumber is greater than the total possible
	 * pages of output, eBay returns the last page of item data in the result set, and the value for pageNumber is
	 * set to the respective (last) page number.
	 */
	int pageNumber
	/**
	 * The total number of items found that match the search criteria in your request. Depending on the input value
	 * for entriesPerPage, the response might include only a portion (a page) of the entire result set. A value of
	 * "0" is returned if eBay does not find any items that match the search criteria.
	 */
	int totalEntries
	/**
	 * The total number of pages of data that could be returned by repeated search requests. Note that if you modify
	 * the value of inputPagination.entriesPerPage in a request, the value output for totalPages will change. A value
	 * of "0" is returned if eBay does not find any items that match the search criteria.
	 */
	int totalPages
}
