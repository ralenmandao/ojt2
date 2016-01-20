package com.ralen.helper.model

/**
 * Response container for the getHistogram call.
 */
public class GetHistogramsResponse {
	/**
	 * Response container for aspect histograms. Aspect histograms are returned for categories only.
	 */
	AspectHistogramContainer aspectHistogramContainer
	/**
	 * Response container for category histograms. This container is returned only when the specified category has
	 * children categories. Note: Category histograms may not be available for some parent categories on the eBay
	 * Motors site.
	 */
	CategoryHistogramContainer categoryHistogramContainer
	/**
	 * Response container for condition histograms. Returned for leaf and parent categories. Only returned when you
	 * search the eBay US site (as of February 2011). International items in US search results are included in the
	 * histogram counts.
	 */
	ConditionHistogramContainer conditionHistogramContainer
	/**
	 * Not used by any call. Reserved for future use.
	 */
	ExtensionType extension
}
