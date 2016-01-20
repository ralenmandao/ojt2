package com.ralen.helper.model

/**
 * Names of filters that can be used for the itemFilter.name field to limit the number of items returned by a
 * find request. Must be accompanied by a corresponding itemFilter.value field.
 */
public class ItemFilterType {
	/**
	 * If set to true, returns only items listed by authorized sellers. true, false
	 */
	boolean AuthorizedSellerOnly
	/**
	 * Limits items to those available to the specified country only. Item filter LocatedIn cannot be used together
	 * with item filter AvailableTo. Expects the two-letter ISO 3166 country code to indicate the country where the
	 * item is located. For English names that correspond to each code (for example, KY="Cayman Islands"), see the
	 * ISO site: .
	 */
	String AvailableTo
	/**
	 * If true, the search results are limited to only items that have Best Offer enabled. Default is false. true,
	 * false
	 */
	boolean BestOfferOnly
	/**
	 * If true, the search results are limited to items for which all or part of the proceeds are given to a charity.
	 * Each item in the search results will include the ID of the given charity. Default is false. true, false
	 */
	boolean CharityOnly
	/**
	 * Limits items to those that have the matching item condition. The order of the results depends on the sortOrder
	 * you specify (not ordered by conditions). Mostly useful to filter items where the seller used one of eBay's
	 * structured item condition formats (conditionId or item specifics) to specify the item condition. If the seller
	 * used item specifics, the condition is only returned in conditionDisplayName. If you repeat condition values,
	 * the values are processed using OR logic. For example: To precisely find only brand new and
	 * manufacturer-refurbished items, pass the filter with values of 1000 and 2000 in the same request. To find all
	 * flavors of new items plus refurbished items (but not used items), pass the filter with values of New, 2000,
	 * and 2500. To find a much broader set of new items, plus items with no condition specified, pass the filter
	 * with values of New and Unspecified. (The order of the values does not affect the results. That is, passing
	 * New, 2000, and then 2500 gives the same results as passing 2000, New, and then 2500.)
	 */
	String Condition
	/**
	 * Limits results to items listed with the specified currency only. For a list of allowed currency values, see .
	 */
	String Currency
	/**
	 * Limits the results to items ending on or after the specified time. Specify a time in the future. Specify the
	 * time in GMT.
	 */
	dateTime EndTimeFrom
	/**
	 * Limits the results to items ending on or before the specified time. Specify a time in the future. Specify the
	 * time in GMT.
	 */
	dateTime EndTimeTo
	/**
	 * If true, excludes all items requiring immediate payment. Default is false. true, false
	 */
	boolean ExcludeAutoPay
	/**
	 * Specify one or more category IDs. Search results will not include items from the specified categories or their
	 * child categories. Valid category IDs. Multiple values are allowed. Up to 25 categories can be specified.
	 */
	String ExcludeCategory
	/**
	 * Specify one or more seller names. Search results will not include items from the specified sellers. The
	 * ExcludeSeller item filter cannot be used together with either the Seller or TopRatedSellerOnly item filters.
	 * Valid seller names. Multiple values are allowed. Up to 100 sellers can be specified.
	 */
	String ExcludeSeller
	/**
	 * Specifies the type of expedited shipping. You can specify either Expedited or OneDayShipping. Only items that
	 * can be shipped by the specified type are returned. ExpeditedShippingType is used together with the
	 * MaxHandlingTime and ReturnsAcceptedOnly filters to filter items for certain kinds of gifting events such as
	 * birthdays or holidays where the items must be delivered by a certain date. If you wish to mimic the behavior
	 * of the eBay holiday filters, you would use ExpeditedShippingType set to either Expedited or OneDayShipping,
	 * MaxHandlingTime to 1, ReturnsAcceptedOnly set to true, and for the Germany site, set PaymentMethod to PayPal.
	 * (The holiday filters may not always be available in the eBay UI, depending on the season; however, the
	 * equivalent filter behavior continues to be available in the API.) Expedited, OneDayShipping
	 */
	String ExpeditedShippingType
	/**
	 * If true, the search results are limited to featured item listings only. Default is false. true, false
	 */
	boolean FeaturedOnly
	/**
	 * Specifies the maximum feedback score of a seller whose items can be included in the response. If
	 * FeedbackScoreMin is also specified, the FeedbackScoreMax value must be greater than or equal to the
	 * FeedbackScoreMin value. Integer greater than or equal to 0.
	 */
	int FeedbackScoreMax
	/**
	 * Specifies the minimum feedback score of a seller whose items can be included in the response. If
	 * FeedbackScoreMax is also specified, the FeedbackScoreMax value must be greater than or equal to the
	 * FeedbackScoreMin value. Integer greater than or equal to 0.
	 */
	int FeedbackScoreMin
	/**
	 * If true, the search results are limited to only items with free shipping to the site specified in the request
	 * (see ). Default is false. true, false
	 */
	boolean FreeShippingOnly
	/**
	 * If true, the search results are limited to only Get It Fast listings. Default is false. true, false
	 */
	boolean GetItFastOnly
	/**
	 * If true, and there are duplicate items for an item in the search results, the subsequent duplicates will not
	 * appear in the results. Default is false. Item listings are considered duplicates when all of the following
	 * conditions are met: 1. Items are listed by the same seller 2. Items have exactly the same item title 3. Items
	 * have similar listing formats:     - Auctions (Auction Items and Auction BIN items)     - Fixed Price (Fixed
	 * Price, Multi-quantity Fixed Price, and Fixed Price with Best Offer Format items)     - Classified Ads For
	 * Auctions, items must also have the same price and number of bids to be considered duplicates. true, false
	 */
	boolean HideDuplicateItems
	/**
	 * The site on which the items were originally listed. This can be useful for buyers who wish to see only items
	 * on their domestic site either for delivery cost reasons or time reasons, such as for gifting occasions like
	 * birthdays or holidays. GlobalID Value
	 */
	Global ID Values ListedIn
	/**
	 * Filters items based listing type information. Default behavior is to return all matching items. Multiple
	 * listing type values can be specified for this filter.
	 */
	String ListingType
	/**
	 * If true, the search results are limited to only items which have local pickup available. Default is false.
	 * true, false
	 */
	boolean LocalPickupOnly
	/**
	 * If true, the search results are limited to only matching items with the Local Inventory Listing Options
	 * (LILO). Must be used together with the item filter, and the request must also specify . Currently, this is
	 * only available for the Motors site (global ID EBAY- MOTOR). true, false
	 */
	boolean LocalSearchOnly
	/**
	 * Limits the result set to just those items located in the specified country. Item filter AvailableTo cannot be
	 * used together with item filter LocatedIn. Expects the two-letter ISO 3166 country code to indicate the country
	 * where the item is located. For English names that correspond to each code (for example, KY="Cayman Islands"),
	 * see the ISO site: . Multiple values are allowed. Up to 25 countries can be specified.
	 */
	String LocatedIn
	/**
	 * If true, the search results are limited to only matching listings for which the lot size is 2 or more. Default
	 * is false. true, false
	 */
	boolean LotsOnly
	/**
	 * Limits the results to items with bid counts less than or equal to the specified value. If MinBids is also
	 * specified, the MaxBids value must be greater than or equal to the MinBids value. Integer greater than or equal
	 * to 0.
	 */
	int MaxBids
	/**
	 * Specifies the maximum distance from the specified postal code () to search for items. The request must also
	 * specify . The minimum distance supported is 5 miles or 10 kilometers, depending upon whether the distance unit
	 * supported for the site to which the request is submitted is miles (mi) or kilometers (km). For example, the
	 * smallest MaxDistance for searches submitted to the US eBay site (global ID EBAY-US) is 5 (miles). The smallest
	 * MaxDistance for searches submitted to the Germany eBay site (global ID EBAY-DE) is 10 (kilometers). Values are
	 * rounded up to the nearest 5 (mi) or 10 (km) increment. For example, a value of 21 will be rounded up to 25
	 * (mi) on the eBay US site and to 30 (km) on the eBay Germany site. Integer greater than or equal to 5.
	 */
	int MaxDistance
	/**
	 * Specifies the maximum number of handling days the seller requires to ship the item. Only items with a handling
	 * time less than or equal to this number will be returned. (The handling time is the amount of time, in days,
	 * required by the seller to get the item ready to ship and handed off to the actual carrier who does the
	 * delivery. It does not include the time required by the carrier to deliver the item. ExpeditedShippingType is
	 * used together with the MaxHandlingTime and ReturnsAcceptedOnly filters to filter items for certain kinds of
	 * gifting events such as birthdays or holidays where the items must be delivered by a certain date. If you wish
	 * to mimic the behavior of the eBay holiday filters, you would use ExpeditedShippingType set to either Expedited
	 * or OneDayShipping, MaxHandlingTime to 1, ReturnsAcceptedOnly set to true, and for the Germany site, set
	 * PaymentMethod to PayPal. (The holiday filters may not always be available in the eBay UI, depending on the
	 * season; however, the equivalent filter behavior continues to be available in the API.) Integer greater than or
	 * equal to 1.
	 */
	int MaxHandlingTime
	/**
	 * Specifies the maximum current price an item can have to be included in the response. Optionally, you can also
	 * specify a currency ID, using the and fields (for example, ). If using with MinPrice to specify a price range,
	 * the MaxPrice value must be greater than or equal to MinPrice. Decimal values greater than or equal to 0.0.
	 */
	decimal MaxPrice
	/**
	 * Limits the results to listings with a quantity less than or equal to the specified value. If MinQuantity is
	 * also specified, the MaxQuantity value must be greater than or equal to the MinQuantity value. Integer greater
	 * than or equal to 1.
	 */
	int MaxQuantity
	/**
	 * Limits the results to items with bid counts greater than or equal to the specified value. If MaxBids is also
	 * specified, the MaxBids value must be greater than or equal to the MinBids value. Integer greater than or equal
	 * to 0.
	 */
	int MinBids
	/**
	 * Specifies the minimum current price an item can have to be included in the response. Optionally, you can also
	 * specify a currency ID, using the and fields (for example, ). If using with MaxPrice to specify a price range,
	 * the MaxPrice value must be greater than or equal to MinPrice. Decimal values greater than or equal to 0.0.
	 */
	decimal MinPrice
	/**
	 * Limits the results to listings with a quantity greater than or equal to the specified value. If MaxQuantity is
	 * also specified, the MaxQuantity value must be greater than or equal to the MinQuantity value. Integer greater
	 * than or equal to 1.
	 */
	int MinQuantity
	/**
	 * Limits the results to active items whose status has changed since the specified time. Specify a time in the
	 * past. Time must be in GMT. Specify the time in GMT.
	 */
	dateTime ModTimeFrom
	/**
	 * If set to true, returns only items listed by sellers at eBay's outlet stores, such as the . true, false
	 */
	boolean OutletSellerOnly
	/**
	 * Limits results to items that accept the specified payment method.
	 */
	String PaymentMethod
	/**
	 * If set to true, returns only items where the seller accepts returns. ExpeditedShippingType is used together
	 * with the MaxHandlingTime and ReturnsAcceptedOnly filters to filter items for certain kinds of gifting events
	 * such as birthdays or holidays where the items must be delivered by a certain date. If you wish to mimic the
	 * behavior of the eBay holiday filters, you would use ExpeditedShippingType set to either Expedited or
	 * OneDayShipping, MaxHandlingTime to 1, ReturnsAcceptedOnly set to true, and for the Germany site, set
	 * PaymentMethod to PayPal. (The holiday filters may not always be available in the eBay UI, depending on the
	 * season; however, the equivalent filter behavior continues to be available in the API.) true, false
	 */
	boolean ReturnsAcceptedOnly
	/**
	 * Specify one or more seller names. Search results will include items from the specified sellers only. The
	 * Seller item filter cannot be used together with either the ExcludeSeller or TopRatedSellerOnly item filters.
	 * Valid seller names. Multiple values are allowed. Up to 100 sellers can be specified.
	 */
	String Seller
	/**
	 * Restricts the items to those that are from sellers whose business type is the specified value. Only one value
	 * can be specified. Not supported on all sites. Applies only to the following sites, which support seller
	 * business features:
	 */
	String SellerBusinessType
	/**
	 * If true, excludes all completed items which are not ended by being sold. This filter can be used only with the
	 * findCompletedItems call. true, false
	 */
	boolean SoldItemsOnly
	/**
	 * Limits the results to items started on or after the specified time. Specify a time in the future. Specify the
	 * time in GMT.
	 */
	dateTime StartTimeFrom
	/**
	 * Limits the results to items started on or before the specified time. Specify a time in the future. Specify the
	 * time in GMT.
	 */
	dateTime StartTimeTo
	/**
	 * If true, the search results are limited to only matching items where the seller qualifies as a top-rated
	 * seller on the specified site. Site is specified with the . The default is EBAY- US (the eBay US site). Default
	 * for this filter is false. The TopRatedSellerOnly item filter cannot be used together with either the Seller or
	 * ExcludeSeller item filters. true, false
	 */
	boolean TopRatedSellerOnly
	/**
	 * This filter can be used in conjunction with the sortOrder PricePlusShippingLowest to return competitively
	 * priced items from eBay top-rated sellers that have a BuyItNow price, with the lowest priced item at the top of
	 * the list. This filter returns items from categories that are catalog-enabled; items from non catalog-enabled
	 * categories are not returned. Sellers can use this item filter to determine competitive pricing; buying
	 * applications can use it to obtain competitive items from top rated sellers that are likely to sell quickly. If
	 * set to 1, the item filter constraints are applied and the items are returned accordingly. If set to 0 (zero)
	 * the item filter is not applied. Defaults to 0. 1, 0
	 */
	boolean ValueBoxInventory
	/**
	 * If true, the search results are limited to only items listed in the World of Good marketplace. Defaults to
	 * false. true, false
	 */
	boolean WorldOfGoodOnly
}
