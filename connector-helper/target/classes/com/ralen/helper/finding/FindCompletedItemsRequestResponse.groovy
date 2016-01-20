package com.ralen.helper.finding

/**
 * This call searches for items whose listings are completed and are no longer available for sale by category
 * (using categoryId), by keywords (using keywords), or a combination of the two. Keyword queries search the
 * title and subtitle of the item; they do not search descriptions.
 */
public class FindCompletedItemsRequestResponse {
	/**
	 * Response container for aspect histograms. AspectHistogram
	 */
	AspectHistogramContainer aspectHistogramContainer
	/**
	 * Response container for category histograms. Only returned when one or more category histograms are returned. A
	 * category histogram is not returned if there are no matching items or if the search is restricted to a single
	 * leaf category. CategoryHistogram
	 */
	CategoryHistogramContainer categoryHistogramContainer
	/**
	 * Reserved for future use. ConditionHistogram
	 */
	ConditionHistogramContainer conditionHistogramContainer
	/**
	 * Indicates whether or not errors or warnings were generated during the processing of the request. none (not
	 * controlled by outputSelector)
	 */
	AckValue ack
	/**
	 * Description of an error or warning that occurred when eBay processed the request. Not returned if the ack
	 * value is Success. none (not controlled by outputSelector)
	 */
	ErrorMessage errorMessage
	/**
	 * Indicates the pagination of the result set. Child elements indicate the page number that is returned, the
	 * maximum number of item listings to return per page, total number of pages that can be returned, and the total
	 * number of listings that match the search criteria. none (not controlled by outputSelector)
	 */
	PaginationOutput paginationOutput
	/**
	 * Container for the item listings that matched the search criteria. The data for each item is returned in
	 * individual containers, if any matches were found. none (not controlled by outputSelector)
	 */
	SearchResult searchResult
	/**
	 * This value represents the date and time when eBay processed the request. This value is returned in GMT, the
	 * ISO 8601 date and time format (YYYY-MM-DDTHH:MM:SS.SSSZ). See the "dateTime" type for information about the
	 * time format, and for details on converting to and from the GMT time zone. none (not controlled by
	 * outputSelector)
	 */
	dateTime timestamp
	/**
	 * The release version that eBay used to process the request. Developer Technical Support may ask you for the
	 * version value if you work with them to troubleshoot issues. none (not controlled by outputSelector)
	 */
	String version
}
