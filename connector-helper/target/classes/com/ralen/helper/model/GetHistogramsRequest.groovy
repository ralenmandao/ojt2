package com.ralen.helper.model

/**
 * Returns a a histogram for the supplied category or aspect.
 */
public class GetHistogramsRequest {
	/**
	 * Specifies the category from which you want to retrieve histogram information. If a specified category ID
	 * doesn't match an existing category for the site, eBay returns an invalid-category error message. To determine
	 * valid categories, use the Shopping API GetCategoryInfo call.
	 */
	String categoryId
}
