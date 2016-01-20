package com.ralen.helper.finding

/**
 * This call searches for items on eBay by category or keyword or both.
 */
public class FindItemsAdvancedRequestRequest {
	/**
	 * Aspect filters refine (limit) the number of items returned by a find request. Obtain input values for
	 * aspectFilter fields from an aspectHistogramContainer returned in the response of a previous query. By issuing
	 * a series of find queries, you can continually refine the items returned in your responses. Do this by
	 * repeating a query using the aspect values returned in one response as the input values to your next query. For
	 * example, the aspectHistogramContainer in a response on Men's Shoes could contain an aspect of Size, along with
	 * "aspect values" for the different sizes currently available in Men's Shoes. By populating aspectFilter fields
	 * with the values returned in an aspectHistogramContainer, you can refine the item results returned by your new
	 * query.
	 */
	AspectFilter aspectFilter
	/**
	 * Specifies the category from which you want to retrieve item listings. This field can be repeated to include
	 * multiple categories. Up to three (3) categories can be specified. If a specified category ID doesn't match an
	 * existing category for the site, eBay returns an invalid-category error message. To determine valid categories,
	 * use the Shopping API call. requires that you specify and/or a in the request. The exception to this rule is
	 * when the Seller item filter is used. The Seller item filter can be used without specifying either or to
	 * retrieve all active items for the specified seller. 10.
	 */
	String categoryId
	/**
	 * Specifies whether your keyword query should be applied to item descriptions in addition to titles. Searching
	 * the text of item descriptions incurs a performance hit (it can take longer than searches that don't include
	 * description searches). If true, the text of the item's description and subtitles will be included in the
	 * search. If false, only item titles are included in keyword searches. false. false.
	 */
	boolean descriptionSearch
	/**
	 * Reduce the number of items returned by a find request using item filters. Use to specify name/value pairs. You
	 * can include multiple item filters in a single request.
	 */
	ItemFilter itemFilter
	/**
	 * Specify one or more words to use in a search query for finding items on eBay. By default, queries search item
	 * titles only. When running queries, it is best to include complete keywords values--eBay checks words in
	 * context with each other. If you are using a URL request and your keyword query consists of multiple words, use
	 * "%20" to separate the words. For example, use "Harry%20Potter" to search for items containing those words in
	 * any order. Queries aren't case-sensitive, so it doesn't matter whether you use uppercase or lowercase letters.
	 * requires that you specify and/or a in the request. The exception to this rule is when the Seller item filter
	 * is used. The Seller item filter can be used without specifying either or to retrieve all active items for the
	 * specified seller. 350. The maximum length for a single word is 98. 2.
	 */
	String keywords
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
