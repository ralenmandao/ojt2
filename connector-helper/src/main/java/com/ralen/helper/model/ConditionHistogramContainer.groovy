package com.ralen.helper.model

/**
 * Container for condition histograms.
 */
public class ConditionHistogramContainer {
	/**
	 * Statistical (item count) information on the condition of items that match the search criteria (or specified
	 * category). For example, the number of brand new items that match the query. Each conditionHistogram specifies
	 * one condition and the number of matching items found. The list of all conditionHistogram containers returned
	 * represents the union of all conditions that were found in the item results. For example, if items were found
	 * in different categories, and if those categories support different sets of item conditions, then all those
	 * conditions are returned in the list, regardless of category. If multiple items use the same condition ID, but
	 * some items use different display names for that condition, the histogram shows the site's default display name
	 * for that condition. This means that the condition name in a histogram may not always exactly match the
	 * condition names on the counted items.
	 */
	ConditionHistogram conditionHistogram
}
