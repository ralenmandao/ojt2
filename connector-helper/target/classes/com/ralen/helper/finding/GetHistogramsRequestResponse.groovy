package com.ralen.helper.finding

/**
 * This call retrieves category and/or aspect histogram information for the eBay category you specify using the
 * categoryId field.
 */
public class GetHistogramsRequestResponse {
	/**
	 * Response container for aspect histograms. Aspect histograms are returned for categories only.
	 */
	AspectHistogramContainer aspectHistogramContainer
	/**
	 * Response container for category histograms. This container is returned only when the specified category has
	 * children categories.
	 */
	CategoryHistogramContainer categoryHistogramContainer
	/**
	 * Response container for condition histograms. Returned for leaf and parent categories. Only returned when you
	 * search the eBay US site (as of February 2011). International items in US search results are included in the
	 * histogram counts.
	 */
	ConditionHistogramContainer conditionHistogramContainer
	/**
	 * Indicates whether or not errors or warnings were generated during the processing of the request.
	 */
	AckValue ack
	/**
	 * Description of an error or warning that occurred when eBay processed the request. Not returned if the ack
	 * value is Success.
	 */
	ErrorMessage errorMessage
	/**
	 * This value represents the date and time when eBay processed the request. This value is returned in GMT, the
	 * ISO 8601 date and time format (YYYY-MM-DDTHH:MM:SS.SSSZ). See the "dateTime" type for information about the
	 * time format, and for details on converting to and from the GMT time zone.
	 */
	dateTime timestamp
	/**
	 * The release version that eBay used to process the request. Developer Technical Support may ask you for the
	 * version value if you work with them to troubleshoot issues.
	 */
	String version
}
