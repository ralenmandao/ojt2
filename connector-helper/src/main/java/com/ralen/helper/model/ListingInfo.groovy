package com.ralen.helper.model

/**
 * Contains information specific to the item listing.
 */
public class ListingInfo {
	/**
	 * Shows whether or not the seller will accept a best offer for the associated item. Best Offer allows a buyer to
	 * make a lower-priced binding offer on a fixed price item. Buyers cannot see how many offers have been made
	 * (only the seller can see this information). To make a best offer on a listing, use the eBay Web site.
	 */
	boolean bestOfferEnabled
	/**
	 * Applies only to auction listings that were listed with a Buy It Now price. Buy It Now lets a user purchase the
	 * item at a fixed price, effectively ending the auction. On most sites, the Buy It Now option is removed (and
	 * this value returns false) once a valid bid is made on the associated item (a valid bid could be a bid above
	 * the reserve price). buyItNowAvailable will return "false" if the listing type is anything but
	 * "AuctionWithBIN". Please ignore buyItNowAvailable for fixed-price listings.
	 */
	boolean buyItNowAvailable
	/**
	 * The Buy It Now Price of the item (if any), in the currency of the site on which the item was listed. You can
	 * use this field to determine if the item was originally listed with Buy It Now, even if the Buy It Now option
	 * is no longer available for the item. For Basic Fixed-Price (FixedPrice), Ad Format (AdFormat), and Classified
	 * Ad (Classified) listings, currentPrice is the current fixed price. Only returned if an item was listed with
	 * Buy It Now.
	 */
	Amount buyItNowPrice
	/**
	 * The listing's Buy It Now Price (if any), converted into the currency of the site to which you sent your search
	 * request. For active items, refresh this value every 24 hours to pick up changes in conversion rates (if this
	 * value has been converted). Price fields are returned as doubles, not necessarily in the traditional monetary
	 * format of the site's country. For example, a US Dollar value might be returned as 3.880001 instead of 3.88.
	 * Only returned if an item was listed with Buy It Now.
	 */
	Amount convertedBuyItNowPrice
	/**
	 * Time stamp specifying when the listing is scheduled to end, or the actual end time if the item listing has
	 * ended. This value is returned in GMT, the ISO 8601 date and time format (YYYY-MM-DDTHH:MM:SS.SSSZ). See the
	 * "dateTime" type for information about the time format, and for details on converting to and from the GMT time
	 * zone. Note: For items that are "Good Till Canceled," this value is 5 minutes later than the actual end time of
	 * the item. This difference in time is intended to facilitate the renewal of these items' end times (which
	 * occurs every 30 days).
	 */
	dateTime endTime
	/**
	 * If true, a generic gift icon displays next the listing's title in search and browse pages.
	 */
	boolean gift
	/**
	 * The format of the listing, such as online auction, fixed price, or advertisement. listingType values: AdFormat
	 * Advertisement to solicit inquiries on listings such as real estate. Permits no bidding on that item, service,
	 * or property. To express interest, a buyer fills out a contact form that eBay forwards to the seller as a lead.
	 * This format does not enable buyers and sellers to transact online through eBay and eBay Feedback is not
	 * available for ad format listings. Auction Competitive-bid online auction format. Buyers engage in competitive
	 * bidding, although Buy It Now may be offered as long as no valid bids have been placed. Online auctions are
	 * listed on eBay.com; they can also be listed in a seller's eBay Store if the seller is a Store owner.
	 * AuctionWithBIN Same as Auction format, but Buy It Now is enabled. AuctionWithBIN changes to Auction if a valid
	 * bid has been placed on the item. Valid bids include bids that are equal to or above any specified reserve
	 * price. Classified Classified Ads connect buyers and sellers, who then complete the sale outside of eBay. This
	 * format does not enable buyers and sellers to transact online through eBay and eBay Feedback is not available
	 * for these listing types. FixedPrice A fixed-price listing. Auction-style bidding is not allowed. On some
	 * sites, this auction format is also known as "Buy It Now Only" (not to be confused with the Buy It Now option
	 * available with competitive- bidding auctions). Fixed-price listings appear on eBay.com; they can also be
	 * listed in a seller's eBay Store if the seller is a Store owner.
	 */
	String listingType
	/**
	 * Time stamp that eBay recorded as the moment the listing was made available. This value is returned in GMT, the
	 * ISO 8601 date and time format (YYYY-MM-DDTHH:MM:SS.SSSZ). See the "dateTime" type for information about the
	 * time format, and for details on converting to and from the GMT time zone. Note that it is possible for
	 * startTime to be different from the value returned by GetSingleItem.
	 */
	dateTime startTime
}
