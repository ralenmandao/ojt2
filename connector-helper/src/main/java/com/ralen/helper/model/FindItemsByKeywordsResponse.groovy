package com.ralen.helper.model

/**
 * Response container for the findItemsByKeywords call.
 */
public class FindItemsByKeywordsResponse {
	/**
	 * Response container for aspect histograms.
	 */
	AspectHistogramContainer aspectHistogramContainer
	/**
	 * Response container for category histograms. Only returned when one or more category histograms are returned. A
	 * category histogram is not returned if the search query returns no matching items. Note: When searching the
	 * eBay Motors site, category histograms may not be available for some parent categories. In these cases, aspect
	 * histograms should be used to refine search results. This behavior is consistent with eBay Motors site search
	 * behavior.
	 */
	CategoryHistogramContainer categoryHistogramContainer
	/**
	 * Response container for condition histograms. Not returned when Condition is specified in itemFilter. That is,
	 * only returned when you have not yet narrowed your search based on specific conditions. Supported for all eBay
	 * sites except US eBay Motors, India (IN), Malaysia (MY) and Philippines (PH). International items that appear
	 * in search results are included in a site's histogram counts.
	 */
	ConditionHistogramContainer conditionHistogramContainer
}
