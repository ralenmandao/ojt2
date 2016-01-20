package com.ralen.helper.model

/**
 * Selling details pertaining to the respective item.
 */
public class SellingStatus {
	/**
	 * The number of bids that have been placed on the item.
	 */
	int bidCount
	/**
	 * The listing's current price converted to the currency of the site specified in the find request (globalId).
	 */
	Amount convertedCurrentPrice
	/**
	 * The current price of the item given in the currency of the site on which the item is listed. That is,
	 * currentPrice is returned in the original listing currency. For competitive-bid item listings, currentPrice is
	 * the current minimum bid price if the listing has no bids, or the current high bid if the listing has bids. A
	 * Buy It Now price has no effect on currentPrice. For Basic Fixed-Price (FixedPrice), Ad Format (AdFormat), and
	 * Classified Ad (Classified) listings, currentPrice is the current fixed price.
	 */
	Amount currentPrice
	/**
	 * Specifies the listing's status in eBay's processing workflow. If an item's EndTime is in the past, but there
	 * are no details about the buyer or high bidder (and the user is not anonymous), you can use sellingState
	 * information to determine whether eBay has finished processing the listing. sellingState values: Active The
	 * listing is still live. It is also possible that the auction has recently ended, but eBay has not completed the
	 * final processing (for example, the high bidder is still being determined). Canceled The listing has been
	 * canceled by either the seller or eBay. Ended The listing has ended and eBay has completed the processing of
	 * the sale (if any). EndedWithSales The listing has been ended with sales. EndedWithoutSales The listing has
	 * been ended without sales.
	 */
	String sellingState
	/**
	 * Time left before the listing ends. The duration is represented in the ISO 8601 duration format
	 * (PnYnMnDTnHnMnS). For listings that have ended, the time left is PT0S (zero seconds). See the "duration" type
	 * for information about this time format.
	 */
	duration timeLeft
}
