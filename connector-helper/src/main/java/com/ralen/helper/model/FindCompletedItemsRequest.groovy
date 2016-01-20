package com.ralen.helper.model

/**
 * Returns items whose listings are completed and are no longer available for sale based on keyword and/or
 * category and doesn't allow searching within item descriptions. You can expect response times for this call to
 * be longer than other types of Finding Service requests. The call must search through historical databases
 * rather than performing a quick lookup on currently listed items. There is a 5,000 limit on the number of
 * findCompletedItems calls an application can make in a single day (even if the application has completed an app
 * check). Be aware that it is possible to use this call in such a way as to violate the terms and conditions of
 * your API License Agreement. Ensure that you do not store the results retrieved from this call or use the
 * results for market research purposes.
 */
public class FindCompletedItemsRequest {
	/**
	 * Aspect filters refine (limit) the number of items returned by a find request. Obtain input values for
	 * aspectFilter fields from an aspectHistogramContainer returned in the response of a previous query. By issuing
	 * a series of find queries, you can continually refine the items returned in your responses. Do this by
	 * repeating a query using the aspect values returned in one response as the input values to your next query. For
	 * example, the aspectHistogramContainer in a response on Men's Shoes could contain an aspect of Size, along with
	 * "aspect values" for the different sizes currently available in Men's Shoes. By populating aspectFilter fields
	 * with the values returned in an aspectHistogramContainer, you can hone the item results returned by your new
	 * query.
	 */
	AspectFilter aspectFilter
	/**
	 * Specifies the category from which you want to retrieve item listings. This field can be repeated to include
	 * multiple categories. If a specified category ID doesn't match an existing category for the site, eBay returns
	 * an invalid-category error message. To determine valid categories, use the Shopping API GetCategoryInfo call.
	 */
	String categoryId
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
	 * The words "and" and "or" are treated like any other word (and not their logical connotation). Only use "and",
	 * "or", or "the" if you are searching for listings containing those specific words. findCompletedItems requires
	 * that you specify either keywords or a categoryId in the search criteria.
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
	/**
	 * Input ISBN, UPC, EAN, or ReferenceID (ePID) to specify the type of product for which you want to search. For
	 * example, to search using an ISBN, specify productID.type=ISBN and set productID.value to an ISBN value. To
	 * search using an eBay Product Reference ID, specify productID.type= ReferenceID and set productID.value to an
	 * ePID value (also known as an Bay Product Reference ID). If you do not know the ePID value for a product, use
	 * FindProducts in the eBay Shopping API to retrieve the desired ePID.
	 */
	ProductId productId
}
