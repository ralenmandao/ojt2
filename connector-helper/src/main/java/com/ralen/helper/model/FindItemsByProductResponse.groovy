package com.ralen.helper.model

/**
 * Response container for the findItemsByProduct call.
 */
public class FindItemsByProductResponse {
	/**
	 * Response container for aspect histograms.
	 */
	AspectHistogramContainer aspectHistogramContainer
	/**
	 * Response container for condition histograms. Not returned when Condition is specified in itemFilter. That is,
	 * only returned when you have not yet narrowed your search based on specific conditions. Only returned when you
	 * search the eBay US site (as of February 2011). International items in US search results are included in the
	 * histogram counts.
	 */
	ConditionHistogramContainer conditionHistogramContainer
}
