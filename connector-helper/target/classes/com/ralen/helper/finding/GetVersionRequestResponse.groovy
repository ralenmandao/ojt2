package com.ralen.helper.finding

/**
 * Returns the current version of the service. This simple call can be used to monitor the service for
 * availability. This call has no input parameters and the response contains only the standard output fields.
 */
public class GetVersionRequestResponse {
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
