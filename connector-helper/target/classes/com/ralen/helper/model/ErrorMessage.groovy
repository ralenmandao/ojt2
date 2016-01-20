package com.ralen.helper.model

/**
 * Information regarding an error or warning that occurred when eBay processed the request. Not returned when the
 * ack value is Success. Run-time errors are not reported here, but are instead reported as part of a SOAP fault.
 */
public class ErrorMessage {
	/**
	 * Details about a single error.
	 */
	ErrorData error
}
