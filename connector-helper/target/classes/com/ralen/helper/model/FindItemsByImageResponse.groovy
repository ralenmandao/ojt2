package com.ralen.helper.model

/**
 * This call is deprecated.
 */
public class FindItemsByImageResponse {
	/**
	 * Not used by any call. Response container for aspect histograms.
	 */
	AspectHistogramContainer aspectHistogramContainer
	/**
	 * Not used by any call. Response container for category histograms. Only returned when one or more category
	 * histograms are returned. A category histogram is not returned if there are no matching items or if the search
	 * is restricted to a single leaf category. Note: The category IDs returned for items in search results are for
	 * the leaf categories in which the items are listed. If you use these category IDs as input, the response will
	 * not return a category histogram. Note: When searching the eBay Motors site, category histograms may not be
	 * available for some parent categories. In these cases, aspect histograms should be used to refine search
	 * results. This behavior is consistent with eBay Motors site search behavior.
	 */
	CategoryHistogramContainer categoryHistogramContainer
	/**
	 * Not used by any call. Response container for condition histograms. These can be returned for any category
	 * (parent or leaf). Not returned when Condition is specified in itemFilter. That is, only returned when you have
	 * not yet narrowed your search based on specific conditions.
	 */
	ConditionHistogramContainer conditionHistogramContainer
}
