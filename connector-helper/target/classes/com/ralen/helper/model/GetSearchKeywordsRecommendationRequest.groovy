package com.ralen.helper.model

/**
 * Checks specified keywords for spelling errors and returns corrected keywords that will provide better search
 * results. If you make a keyword query search that returns no results, use this call to check the keywords for
 * misspellings. The call checks the words in context of the entire query. For example, if you submit "arry
 * potter" in the request, the response will recommend "harry potter." However, if you submit "potter arry" in
 * the request, the response will recommend "potter army." The response will not return recommended keywords in
 * the following conditions:
 */
public class GetSearchKeywordsRecommendationRequest {
	/**
	 * Specify one or more words to use in a search query for finding items on eBay. It is best to include the
	 * complete keywords value, as words are checked in context with each other. If you are using a URL request and
	 * your keyword query consists of multiple words, use %20 to separate the words (for example, arry%20Potter).
	 * Submitted keywords are not case sensitive. Keyword recommendations will not be returned if the submitted
	 * keywords are accepted standard spellings for item listings. For example, no recommended keywords are returned
	 * for "nrfb" (Never Removed From Box) even if the keywords query does not return any search results, because
	 * this is an accepted listing term. If no correct spelling can be identified for submitted keywords (such as
	 * aabbccdd), no recommended keywords are returned, even though the keyword is obviously not a word and will not
	 * return search results.
	 */
	String keywords
}
