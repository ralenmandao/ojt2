package com.ralen.helper.model

/**
 * There are three categories of error: request errors, application errors, and system errors. Request and
 * application errors are often caused by passing invalid data in the request. System errors are primarily caused
 * by application failures and cannot be corrected by changing request values.
 */
public enum ErrorCategory {
	/**
	 * An error occurred due to a problem with the request, with the most likely source being the application sending
	 * the request. For example, the request is missing a required data element or it contains an invalid field. The
	 * problem must be corrected before the request can be resent. Inspect the error message to find the cause of the
	 * problem. If the problem is due to an application error, modify the application and resend the request. If the
	 * error is due to invalid data, the source of the data must be corrected before you resend the resend request to
	 * eBay.
	 */
	Application,
	/**
	 * An error occurred due to a problem with the request, with the most likely source being missing or invalid data
	 * in the request. The problem must be corrected before the request can be retried. Inspect the error message to
	 * find the cause of the problem. If the problem is a result of end-user data, alert the end-user to the problem
	 * and provide the means for them to correct the problem. Once the problem is resolved, resend the request to
	 * eBay.
	 */
	Request,
	/**
	 * Indicates that an error has occurred on the eBay system side. For example, a database or server could be down.
	 * Inspect the error message to find the cause of the problem. If the problem is on the eBay side, an application
	 * can retry the request as-is a reasonable number of times (eBay recommends twice). If the error persists,
	 * contact Developer Technical Support. Once the problem has been resolved, the request may be resent in its
	 * original form.
	 */
	System
}
