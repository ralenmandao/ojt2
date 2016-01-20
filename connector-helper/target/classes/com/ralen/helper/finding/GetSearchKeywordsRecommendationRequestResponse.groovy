package com.ralen.helper.finding

/**
 * This call retrieves commonly used words found in eBay titles, based on the words you supply to the call.
 */
public class GetSearchKeywordsRecommendationRequestResponse {
	/**
	 * Contains a spell-checked version of the submitted keywords. If no recommended spelling can be identified for
	 * the submitted keywords, the response contains a warning to that effect and an empty keywords field is
	 * returned. 350.
	 */
	String keywords
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
