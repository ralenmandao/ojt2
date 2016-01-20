package com.ralen.helper.model

/**
 * Values that can be used to sort search results.
 */
public enum SortOrderType {
	/**
	 * Sorts items by Best Match, which is based on community buying activity and other relevance-based factors.
	 */
	Bestmatch,
	/**
	 * Sorts items by the number of bids they have received, with items that have received the fewest bids first. To
	 * sort by bid count, you must specify a listing type filter to limit results to auction listings only (such as,
	 * ).
	 */
	Bidcountfewest,
	/**
	 * Sorts items by the number of bids they have received, with items that have received the most bids first. To
	 * sort by bid count, you must specify a listing type filter to limit results to auction listings only (such as,
	 * ).
	 */
	Bidcountmost,
	/**
	 * Sorts items available on the given site (as specified by ) by the country in which they are located. For
	 * CountryAscending, items located in the country most closely associated with the site appear first, followed by
	 * items in related countries, and then items from other countries. For example, when searching the Ireland site,
	 * items located in Ireland (IE) will be returned first, followed by items located in related countries like the
	 * United Kingdom (GB), the United States (US), Hong Kong (HK), and Singapore (SG) next. Remaining items are
	 * sorted in alphabetical order by English country name (regardless of the language for the site), with some
	 * exceptions (for example, United States sorts first, APO/FPO sorts near the end). CountryAscending applies to
	 * the following sites only: Austria (EBAY-AT), Belgium-French (EBAY-FRBE), Belgium-Netherlands (EBAY-NLBE),
	 * Germany (EBAY-DE), Ireland (EBAY-IE), Netherlands (EBAY-NL), Poland (EBAY-PL), Spain (EBAY-ES), and
	 * Switzerland (EBAY-CH).
	 */
	Countryascending,
	/**
	 * Sorts items available on the given site (as specified by global ID in the HTTP header or URL parameter) by the
	 * country in which they are located. For CountryDescending, items are sorted in reverse order of
	 * CountryAscending. That is, items in countries not specifically related to the site appear first, sorted in
	 * descending alphabetical order by English country name. For example, when searching the Ireland site, items
	 * located in countries like Yugoslavia or Uganda are returned first. Items located in Ireland (IE) will be
	 * returned last. CountryDescending applies to the following sites only: Austria (EBAY-AT), Belgium-French
	 * (EBAY-FRBE), Belgium-Netherlands (EBAY-NLBE), Germany (EBAY-DE), Ireland (EBAY-IE), Netherlands (EBAY-NL),
	 * Poland (EBAY-PL), Spain (EBAY-ES), and Switzerland (EBAY-CH).
	 */
	Countrydescending,
	/**
	 * Sorts items by their current price, with the highest price first.
	 */
	Currentpricehighest,
	/**
	 * Sorts items by distance from the buyer in ascending order. The request must also include a buyerPostalCode.
	 */
	Distancenearest,
	/**
	 * Sorts items by end time, with items ending soonest listed first.
	 */
	Endtimesoonest,
	/**
	 * Sorts items by the combined cost of the item price plus the shipping cost, with highest combined price items
	 * listed first. Items are returned in the following groupings: highest total-cost items (for items where
	 * shipping was properly specified) appear first, followed by freight- shipping items, and then items for which
	 * no shipping was specified. Each group is sorted by price.
	 */
	Priceplusshippinghighest,
	/**
	 * Sorts items by the combined cost of the item price plus the shipping cost, with the lowest combined price
	 * items listed first. Items are returned in the following groupings: lowest total-cost items (for items where
	 * shipping was properly specified) appear first, followed by freight- shipping items, and then items for which
	 * no shipping was specified. Each group is sorted by price.
	 */
	Priceplusshippinglowest,
	/**
	 * Sorts items by the start time, the most recently listed (newest) items appear first.
	 */
	Starttimenewest
}
