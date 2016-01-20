package com.ralen.helper.model

/**
 * Base response container for all service operations. Contains error information associated with the request.
 */
public class BaseServiceResponse {
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
	 * version value if you work with them to troubleshoot issues. Note: The version in use is normally the latest
	 * release version, as specified in the release notes. Note that eBay releases the API to international sites
	 * about a week after the API version is released to the US site.
	 */
	String version
}
