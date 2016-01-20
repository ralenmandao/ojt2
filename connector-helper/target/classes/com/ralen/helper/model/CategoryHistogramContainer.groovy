package com.ralen.helper.model

/**
 * Base container for histogram information.
 */
public class CategoryHistogramContainer {
	/**
	 * Statistical (item count) information on the categories that contain items that match the search criteria or
	 * specified category or categories. A category histogram contains information for up to 10 child categories.
	 * Search result total entries may not necessarily match the sum of category histogram item counts. For search
	 * calls, the item count shows the distribution of matching items across each of the returned categories. A
	 * category histogram is not returned if there are no matching items or if the search is restricted to a single
	 * leaf category. For getHistograms, the category histogram contains the total item count for the specified
	 * category and item counts for the child categories containing the most item listings. A category histogram is
	 * not returned if the specified category is a leaf category. For categories associated with specific items,
	 * review the individual item containers returned in the search result.
	 */
	CategoryHistogram categoryHistogram
}
