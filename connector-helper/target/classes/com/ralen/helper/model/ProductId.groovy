package com.ralen.helper.model

/**
 * Type that represents the unique identifier for a single product.
 */
public class ProductId {
	/**
	 * The nature of the identifier being used. Applies to findCompletedItems and findItemsByProduct. For
	 * findItemsByProduct, search by a single type. productId values: ReferenceID The global reference ID (ePID) for
	 * an eBay catalog product. A reference ID is a fixed reference to a product, regardless of version. Use
	 * FindProducts in the Shopping API to determine valid ePID values that you can use as input to
	 * findItemsByProduct or findCompletedItems. Each product in the response includes its reference ID. ISBN ISBN-10
	 * or ISBN-13 value for books. (The string length of ProductID indicates whether the ID is 10 or 13 characters.)
	 * If you know a book's ISBN, you can use this instead of the eBay Reference ID to search for that book. Max
	 * length of corresponding value: 13 UPC UPC value for products in Music (for example, CDs), DVDs & Movies, and
	 * Video Games categories. If you know a product's UPC, you can use this instead of the eBay Reference ID to
	 * search for that product. Max length of corresponding value: 12 EAN EAN value for books. (This is used more
	 * commonly in European countries.) If you know a book's EAN, you can use this instead of the eBay Reference ID
	 * to search for that book. Max length of corresponding value: 13
	 */
	String type
}
