package com.ralen.helper.model

/**
 * This is the base request container for all Finding Service operations.
 */
public class BestMatchFindingServiceRequest {
	/**
	 * Container for affiliate details. eBay uses the specified affiliate information to build a View Item URL and
	 * Product URL string with correctly formatted affiliate tracking information, which it returns in the response.
	 * You can publish these URLs, and if a user clicks them to access eBay, the respective affiliate might get a
	 * commission, depending on the user's actions.
	 */
	Affiliate affiliate
	/**
	 * The postal code of the buyer. This is used as the basis for proximity searches as well as local searches. A
	 * proximity search requires buyerPostalCode and a MaxDistance item filter. A local search requires
	 * buyerPostalCode and item filters for MaxDistance and LocalSearch.
	 */
	String buyerPostalCode
	/**
	 * Controls the pagination of the result set. Child elements specify the maximum number of item listings to
	 * return per call and the page of data to return. Controls the number of listings returned in the response, but
	 * does not specify the details to return for each listing. Note: No more than 10,000 items can be retrieved for
	 * a given search, regardless of how many matches are found. This limit is enforced by the maximum page number
	 * allowed (100) and the maximum entries per page allowed (100).
	 */
	PaginationInput paginationInput
}
