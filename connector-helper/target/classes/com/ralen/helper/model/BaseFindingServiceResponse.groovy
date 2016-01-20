package com.ralen.helper.model

/**
 * Base response container for all Finding Service operations.
 */
public class BaseFindingServiceResponse {
	/**
	 * Not used by any call. Reserved for future use.
	 */
	ExtensionType extension
	/**
	 * A URL to view the search results on the eBay web site. The search results on the web site will use the same
	 * pagination as the API search results. Note: eBay URLs returned in fields, such as viewItemURL, are subject to
	 * syntax and other changes without notice. To avoid problems in your application when eBay alters the URL
	 * format, we advise you to avoid parsing eBay URLs programmatically. We strive to ensure that other fields in
	 * the response contain all the information that is encoded in the URL, and more.
	 */
	anyURI itemSearchURL
	/**
	 * Indicates the pagination of the result set. Child elements indicate the page number that is returned, the
	 * maximum number of item listings to return per page, total number of pages that can be returned, and the total
	 * number of listings that match the search criteria.
	 */
	PaginationOutput paginationOutput
	/**
	 * Container for the item listings that matched the search criteria. The data for each item is returned in
	 * individual containers, if any matches were found.
	 */
	SearchResult searchResult
}
