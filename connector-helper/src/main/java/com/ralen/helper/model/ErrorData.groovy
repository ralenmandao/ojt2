package com.ralen.helper.model

/**
 * A container for error details.
 */
public class ErrorData {
	/**
	 * There are three categories of errors: request errors, application errors, and system errors.
	 */
	ErrorCategory category
	/**
	 * Name of the domain in which the error occurred. domain values: Marketplace A business or validation error
	 * occurred in the service. SOA An exception occurred in the Service Oriented Architecture (SOA) framework.
	 */
	String domain
	/**
	 * A unique code that identifies the particular error condition that occurred. Your application can use error
	 * codes as identifiers in your customized error-handling algorithms.
	 */
	long errorId
	/**
	 * Unique identifier for an exception associated with an error.
	 */
	String exceptionId
	/**
	 * A detailed description of the condition that caused in the error.
	 */
	String message
	/**
	 * Various warning and error messages return one or more variables that contain contextual information about the
	 * error. This is often the field or value that triggered the error.
	 */
	ErrorParameter parameter
	/**
	 * Indicates whether the reported problem is fatal (an error) or is less- severe (a warning). Review the error
	 * message details for information on the cause. If the request fails and the application is the source of the
	 * error (for example, a required element is missing), update the application before you retry the request. If
	 * the problem is due to incorrect user data, alert the end-user to the problem and provide the means for them to
	 * correct the data. Once the problem in the application or data is resolved, re-send the request to eBay. If the
	 * source of the problem is on eBay's side, you can retry the request a reasonable number of times (eBay
	 * recommends you try the request twice). If the error persists, contact Developer Technical Support. Once the
	 * problem has been resolved, you can resend the request in its original form. If a warning occurs, warning
	 * information is returned in addition to the business data. Normally, you do not need to resend the request (as
	 * the original request was successful). However, depending on the cause of the warning, you might need to
	 * contact the end user, or eBay, to effect a long term solution to the problem.
	 */
	ErrorSeverity severity
	/**
	 * Name of the subdomain in which the error occurred. subdomain values: Finding The error is specific to the
	 * Finding service. MarketplaceCommon The error is common to all Marketplace services.
	 */
	String subdomain
}
