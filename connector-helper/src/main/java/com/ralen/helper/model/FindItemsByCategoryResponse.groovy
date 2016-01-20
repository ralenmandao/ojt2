package com.ralen.helper.model

/**
 * Response container for the findItemsByKeywords call.
 */
public class FindItemsByCategoryResponse {
	/**
	 * Response container for aspect histograms. Aspect histograms are returned for categories.
	 */
	AspectHistogramContainer aspectHistogramContainer
	/**
	 * Response container for a category histogram. This container is returned only when the specified category has
	 * children categories. Note: The category IDs returned for items in search results are for the leaf categories
	 * in which the items are listed. If you use a leaf category ID as input, the response will not return a category
	 * histogram. Note: When searching the eBay Motors site, category histograms may not be available for some parent
	 * categories. In these cases, aspect histograms should be used to refine search results. This behavior is
	 * consistent with eBay Motors site search behavior.
	 */
	CategoryHistogramContainer categoryHistogramContainer
	/**
	 * Response container for condition histograms. Condition histograms are returned for any category (leaf or
	 * parent). Not returned when Condition is specified in itemFilter. That is, only returned when you have not yet
	 * narrowed your search based on specific conditions. Only returned when you search the eBay US site (as of
	 * February 2011). International items in US search results are included in the histogram counts.
	 */
	ConditionHistogramContainer conditionHistogramContainer
}
