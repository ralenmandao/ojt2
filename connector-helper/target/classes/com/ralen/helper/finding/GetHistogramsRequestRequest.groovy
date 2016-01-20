package com.ralen.helper.finding

/**
 * This call retrieves category and/or aspect histogram information for the eBay category you specify using the
 * categoryId field.
 */
public class GetHistogramsRequestRequest {
	/**
	 * Specifies the category from which you want to retrieve histogram information. If a specified category ID
	 * doesn't match an existing category for the site, eBay returns an invalid-category error message. To determine
	 * valid categories, use the Shopping API call. 10.
	 */
	String categoryId
}
