package com.ralen.helper.model

/**
 * This call is deprecated.
 */
public class FindItemsByImageRequest {
	/**
	 * Not used by any call. Aspect filters refine (limit) the number of items returned by a find request. Obtain
	 * input values for aspectFilter fields from an aspectHistogramContainer returned in the response of a previous
	 * query. By issuing a series of find queries, you can continually refine the items returned in your responses.
	 * Do this by repeating a query using the aspect values returned in one response as the input values to your next
	 * query. For example, the aspectHistogramContainer in a response on Men's Shoes could contain an aspect of Size,
	 * along with "aspect values" for the different sizes currently available in Men's Shoes. By populating
	 * aspectFilter fields with the values returned in an aspectHistogramContainer, you can refine the item results
	 * returned by your new query.
	 */
	AspectFilter aspectFilter
	/**
	 * Not used by any call. Specifies the leaf category from which you want to retrieve item listings with similar
	 * images. If no category is specified, search results can come from any Clothing, Shoes & Accessories leaf
	 * category. This field can be repeated (up to 3 times) to include multiple categories. Image similarity searches
	 * are only supported in Clothing, Shoes & Accessories leaf categories on the eBay US, UK, and Germany sites. If
	 * a specified category ID doesn't match an existing category for the site, eBay returns an invalid-category
	 * error message. To determine valid leaf categories, use the Shopping API GetCategoryInfo call.
	 */
	String categoryId
	/**
	 * Not used by any call. As of October 2014, domains will be deprecated and "category" is used instead.
	 */
	DomainFilter domainFilter
	/**
	 * Not used by any call. Reduce the number of items returned by a find request using item filters. Use itemFilter
	 * to specify name/value pairs. You can include multiple item filters in a single request.
	 */
	ItemFilter itemFilter
	/**
	 * Not used by any call. Specifies the item that the customer wants to use for retrieving more listings with
	 * similar images. The item must active and it must be listed in a Clothing, Shoes & Accessories category (parent
	 * category ID 11450 on the eBay US site). In addition, the item ID you specify must exist on either the US, UK,
	 * or DE the sites.
	 */
	String itemId
	/**
	 * Not used by any call. Defines what data to return, in addition to the default set of data, in a response. If
	 * you don't specify this field, eBay returns a default set of item fields. Use outputSelector to include more
	 * information in the response. The additional data is grouped into discrete nodes. You can specify multiple
	 * nodes by including this field multiple times, as needed, in the request. If you specify this field, the
	 * additional fields returned can affect the call's response time (performance), including in the case with
	 * feedback data.
	 */
	OutputSelectorType outputSelector
}
