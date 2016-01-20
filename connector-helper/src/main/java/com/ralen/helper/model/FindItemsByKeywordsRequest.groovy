package com.ralen.helper.model

/**
 * Returns items based on a keyword query and returns details for matching items. Item filters can be used to
 * restrict search results. Aspect filters can be used to further refine results. Use outputSelector to expand
 * the amount of data returned for each matching item.
 */
public class FindItemsByKeywordsRequest {
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
	 * Not used by any call. As of October 2014, domains will be deprecated and "category" is used instead.
	 */
	DomainFilter domainFilter
	/**
	 * Reduce the number of items returned by a find request using item filters. Use itemFilter to specify name/value
	 * pairs. You can include multiple item filters in a single request.
	 */
	ItemFilter itemFilter
	/**
	 * Specify one or more words to use in a search query for finding items on eBay. By default, queries search item
	 * titles only. When running queries, it is best to include complete keywords values--eBay checks words in
	 * context with each other. If you are using a URL request and your keyword query consists of multiple words, use
	 * "%20" to separate the words. For example, use "Harry%20Potter" to search for items containing those words in
	 * any order. Queries aren't case-sensitive, so it doesn't matter whether you use uppercase or lowercase letters.
	 */
	String keywords
	/**
	 * Specifies what item data to return in a response in addition to the default set of data. If you don't specify
	 * this field, eBay returns a default set of item fields. Use outputSelector to include more item information in
	 * the response. The additional data is grouped into discrete nodes. You can specify multiple nodes by including
	 * this field multiple times, as needed, in the request. If you specify this field, the additional fields
	 * returned can affect the call's performance (response time), as is the case with including seller feedback
	 * data.
	 */
	OutputSelectorType outputSelector
}
