package com.ralen.helper.finding

/**
 * This call searches for items on eBay using specific eBay product values.
 */
public class FindItemsByProductRequestRequest {
	/**
	 * Reduce the number of items returned by a find request using item filters. Use to specify name/value pairs. You
	 * can include multiple item filters in a single request.
	 */
	ItemFilter itemFilter
	/**
	 * Defines what data to return, in addition to the default set of data, in a response. If you don't specify this
	 * field, eBay returns a default set of item fields. Use outputSelector to include more information in the
	 * response. The additional data is grouped into discrete nodes. You can specify multiple nodes by including this
	 * field multiple times, as needed, in the request. If you specify this field, the additional fields returned can
	 * affect the call's response time (performance), including in the case with feedback data. : See .
	 */
	OutputSelectorType outputSelector
	/**
	 * Container for affiliate details. eBay uses the specified affiliate information to build a View Item URL and
	 * Product URL string with correctly formatted affiliate tracking information, which it returns in the response.
	 * You can publish these URLs, and if a user clicks them to access eBay, the respective affiliate might get a
	 * commission, depending on the user's actions.
	 */
	Affiliate affiliate
	/**
	 * The postal code of the buyer. This is used as the basis for proximity searches as well as local searches. A
	 * proximity search requires and a item filter. A local search requires and item filters for and .
	 */
	String buyerPostalCode
	/**
	 * Controls the pagination of the result set. Child elements specify the maximum number of item listings to
	 * return per call and the page of data to return. Controls the number of listings returned in the response, but
	 * does not specify the details to return for each listing.
	 */
	PaginationInput paginationInput
	/**
	 * Sort the returned items according to a single specified sort order. BestMatch. : See .
	 */
	SortOrderType sortOrder
}
