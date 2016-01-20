package com.ralen.helper.model

/**
 * If a seller offers an item for less than the Minimum Advertised Price (MAP) of that item, the seller cannot
 * show the actual discounted price on the view item page. The buyer must open a pop-up on view item page or the
 * discount price will be shown during checkout. MinimumAdvertisedPriceExposure provides enums for specifying how
 * the buyer is to view the discounted price, either PreCheckout or DuringCheckout. This is applicable for MAP
 * items only.
 */
public enum MapExposureEnum {
	/**
	 * DuringCheckout specifies that the discounted price must be shown on the eBay checkout flow page.
	 */
	Duringcheckout,
	/**
	 * PreCheckout specifies that the buyer must click a link (or a button) to navigate to a separate page (or
	 * window) that displays the discount price.
	 */
	Precheckout
}
