package com.ralen.helper.model

/**
 * Response container for the spelling check and correction for keywords.
 */
public class GetSearchKeywordsRecommendationResponse {
	/**
	 * Not used by any call. Reserved for future use.
	 */
	ExtensionType extension
	/**
	 * Contains a spell-checked version of the submitted keywords. If no recommended spelling can be identified for
	 * the submitted keywords, the response contains a warning to that effect and an empty keywords field is
	 * returned.
	 */
	String keywords
}
