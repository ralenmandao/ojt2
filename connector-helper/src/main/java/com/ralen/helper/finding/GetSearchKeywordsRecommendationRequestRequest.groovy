package com.ralen.helper.finding

/**
 * This call retrieves commonly used words found in eBay titles, based on the words you supply to the call.
 */
public class GetSearchKeywordsRecommendationRequestRequest {
	/**
	 * Specify one or more words to use in a search query for finding items on eBay. It is best to include the
	 * complete keywords value, as words are checked in context with each other. If you are using a URL request and
	 * your keyword query consists of multiple words, use to separate the words (for example, ). Submitted keywords
	 * are not case sensitive. Keyword recommendations will not be returned if the submitted keywords are accepted
	 * standard spellings for item listings. For example, no recommended keywords are returned for "nrfb" (Never
	 * Removed From Box) even if the keywords query does not return any search results, because this is an accepted
	 * listing term. If no correct spelling can be identified for submitted keywords (such as ), no recommended
	 * keywords are returned, even though the keyword is obviously not a word and will not return search results.
	 * 350. The maximum length for a single word is 98. 2.
	 */
	String keywords
}
