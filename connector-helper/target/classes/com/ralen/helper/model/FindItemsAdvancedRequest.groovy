package com.ralen.helper.model

/**
 * Returns items based on keyword and/or category and allows searching within item descriptions.
 */
public class FindItemsAdvancedRequest {
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
	 * use the Shopping API GetCategoryInfo call. findItemsAdvanced requires that you specify keywords and/or a
	 * categoryId in the request. The exception to this rule is when the Seller item filter is used. The Seller item
	 * filter can be used without specifying either keywords or categoryId to retrieve all active items for the
	 * specified seller.
	 */
	String categoryId
	/**
	 * Specifies whether your keyword query should be applied to item descriptions in addition to titles. Searching
	 * the text of item descriptions incurs a performance hit (it can take longer than searches that don't include
	 * description searches). If true, the text of the item's description and subtitles will be included in the
	 * search. If false, only item titles are included in keyword searches.
	 */
	boolean descriptionSearch
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
	 * findItemsAdvanced requires that you specify keywords and/or a categoryId in the request. The exception to this
	 * rule is when the Seller item filter is used. The Seller item filter can be used without specifying either
	 * keywords or categoryId to retrieve all active items for the specified seller.
	 */
	String keywords
	/**
	 * Defines what data to return, in addition to the default set of data, in a response. If you don't specify this
	 * field, eBay returns a default set of item fields. Use outputSelector to include more information in the
	 * response. The additional data is grouped into discrete nodes. You can specify multiple nodes by including this
	 * field multiple times, as needed, in the request. If you specify this field, the additional fields returned can
	 * affect the call's response time (performance), including in the case with feedback data.
	 */
	OutputSelectorType outputSelector
}
