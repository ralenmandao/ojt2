package com.ralen.helper.model

/**
 * This container supplies information for an item that has a Strike-Through Pricing (STP) or Minimum Advertised
 * Price (MAP) discount pricing treatment. STP and MAP applies to only fixed price, BIN items. STP is available
 * on the US, UK, and DE sites while MAP is available only on the US site. This feature is available to qualified
 * sellers who participate in the Discount Pricing program. A seller can provide a discount price treatment for
 * Non-MSKU and MSKU items in Clothing, Shoes and Accessories (CDA), Motors, and Electronics (Home and Garden is
 * expected to be supported in the future).
 */
public class DiscountPriceInfo {
	/**
	 * If pricingTreatment is MAP, the item price cannot be displayed directly on the page containing the item. When
	 * listing a MAP item, the seller stipulates how they want the buyer to view the price of the item by setting
	 * this field to either PreCheckout or DuringCheckout. If this field is set to PreCheckout, the buyer must click
	 * a link (or button) to view the item price on a different page (such as in a pop-up window). If this field is
	 * set to DuringCheckout, the currentPrice must be shown only when the buyer is driven to the eBay site, where
	 * the price is displayed in the checkout flow. MAP items are supported only on the eBay US site.
	 */
	MapExposureEnum minimumAdvertisedPriceExposure
	/**
	 * This field contains the price to which a discounted-price display treatment is to be applied (for example, a
	 * strikethrough price). The discounted price of an item (specified in the currentPrice field) is the BIN price
	 * and is less than the originalRetailPrice of the item.
	 */
	Amount originalRetailPrice
	/**
	 * This field denotes whether or not an item qualifies for a discount pricing treatment display. If a seller
	 * lists an item with DiscountPriceInfo values, the item response container will include a DiscountPriceInfo
	 * container, and this field will be set to either STP, MAP, or None. If this field is set to MAP, you must abide
	 * by the rules for displaying MAP items, as described in minimumAdvertisedPriceExposure. Important: For listings
	 * that return PricingTreatment set to MAP, you are legally required to follow the rules for displaying the price
	 * of the item to potential buyers. You are bound by the terms of the API License Agreement to follow these
	 * rules. Refer to the API License Agreement for consequences of non-compliance.
	 */
	PriceTreatmentEnum pricingTreatment
	/**
	 * Used by the eBay UK and eBay Germany (DE) sites, this field indicates that the discount price (specified as
	 * currentPrice) is the price for which the seller offered the same item for sale on a web site or offline store
	 * other than eBay in the previous 30 days. The discount price is always in reference to the seller's own price
	 * for the item. In the event both soldOffEbay and soldOnEbay fields are set, soldOnEbay takes precedence.
	 */
	boolean soldOffEbay
	/**
	 * Used by the eBay UK and eBay Germany (DE) sites, this field indicates that the discount price (specified as
	 * currentPrice) is the price for which the seller offered the same (or similar) item for sale on eBay within the
	 * previous 30 days. The discount price is always in reference to the seller's own price for the item. In the
	 * event both soldOffEbay and soldOnEbay fields are set, soldOnEbay takes precedence.
	 */
	boolean soldOnEbay
}
