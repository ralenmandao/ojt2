package com.ralen.helper.model

/**
 * Returns items based on a product base on ISBN, UPC, EAN, or ePID (eBay Product Reference ID).
 */
public class FindItemsByProductRequest {
	/**
	 * Reduce the number of items returned by a find request using item filters. Use itemFilter to specify name/value
	 * pairs. You can include multiple item filters in a single request.
	 */
	ItemFilter itemFilter
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
	 * search using an eBay Product Reference ID, set productId.type to "ReferenceID" and set productId.value to an
	 * ePID value (also known as an Bay Product Reference ID). If you do not know the ePID value for a product, use
	 * FindProducts in the eBay Shopping API to retrieve the desired ePID.
	 */
	ProductId productId
}
