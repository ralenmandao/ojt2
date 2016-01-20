package com.ralen.helper.model

/**
 * Container holding the item's shipping details.
 */
public class ShippingInfo {
	/**
	 * This is returned set to true if expedited shipping is available for the item. This field is returned only for
	 * items listed on the eBay US site.
	 */
	boolean expeditedShipping
	/**
	 * The number of days it will take the seller to ship this item. This field is returned only for items listed on
	 * the eBay US site.
	 */
	int handlingTime
	/**
	 * Not used by any call.
	 */
	boolean intermediatedShipping
	/**
	 * This is returned set to true if one-day shipping is available for the item. This field is returned only for
	 * items listed on the eBay US site.
	 */
	boolean oneDayShippingAvailable
	/**
	 * The basic shipping cost of the item. This reflects the domestic shipping cost or the international shipping
	 * costs, depending on which applies (that is, whether the bidder/buyer is in the same country as the listing
	 * site of the item).
	 */
	Amount shippingServiceCost
	/**
	 * The shipping method that was used for determining the cost of shipping. For example: flat rate, calculated, or
	 * free. The seller specifies the available shipping services when they list the item. shippingType values:
	 * Calculated The calculated shipping model: The posted cost of shipping is based on the buyer-selected shipping
	 * service, chosen by the buyer from the different shipping services offered by the seller. The shipping costs
	 * are calculated by eBay and the shipping carrier, based on the buyer's address. Any packaging and handling
	 * costs established by the seller are automatically rolled into the total. CalculatedDomesticFlatInternational
	 * The seller specified one or more calculated domestic shipping services and one or more flat international
	 * shipping services. Flat The flat-rate shipping model: The seller establishes the cost of shipping and any
	 * shipping insurance, regardless of what any buyer-selected shipping service might charge the seller.
	 * FlatDomesticCalculatedInternational The seller specified one or more flat domestic shipping services and one
	 * or more calculated international shipping services. Free Free is used when the seller has declared that
	 * shipping is free for the buyer. FreePickup No shipping available, the buyer must pick up the item from the
	 * seller. Freight The freight shipping model: the cost of shipping is determined by a third party,
	 * FreightQuote.com, based on the buyer's address (postal code). FreightFlat The flat rate shipping model: the
	 * seller establishes the cost of freight shipping and freight insurance, regardless of what any buyer-selected
	 * shipping service might charge the seller. NotSpecified The seller did not specify the shipping type. Note: The
	 * international leg of the Global Shipping Program is always considered to be a calculated shipping type, and it
	 * is entirely the responsibility of the international shipping provider. If Global Shipping is available for an
	 * item, and the seller chooses to provide the Flat shipping type domestically for that item, this field will
	 * return a value of FlatDomesticCalculatedInternational to account for both legs of the shipment. If the seller
	 * offers the item with Calculated domestic shipping, this field will return a value of Calculated, which also
	 * accounts for both legs of the shipment. For a purely domestic shipment, you can ignore the information about
	 * the international leg.
	 */
	String shippingType
	/**
	 * An international location or region to which the seller is willing to ship the item. Only returned when the
	 * seller has specifically identified locations where she is willing to ship the given item. specified.
	 */
	String shipToLocations
}
