package com.ralen.helper.model

/**
 * Values that specify additional information to be returned in the search results.
 */
public enum OutputSelectorType {
	/**
	 * Include an AspectHistogram container with information about aspects from the category that is most relevant to
	 * your search.
	 */
	Aspecthistogram,
	/**
	 * Include a CategoryHistogram container with information about categories that match your search.
	 */
	Categoryhistogram,
	/**
	 * Include a ConditionHistogram container with the number of items found per condition (for example, how many
	 * items are new). This value has no effect when Condition is specified as an item filter. Supported for all eBay
	 * sites except US eBay Motors, India (IN), Malaysia (MY) and Philippines (PH).
	 */
	Conditionhistogram,
	/**
	 * Include the GalleryInfoContainer, which contains URLs for three thumbnail images of the item in different
	 * sizes: large, medium, and small.
	 */
	Galleryinfo,
	/**
	 * Include a URL to a picture of the item that is 400x400 pixels in size.
	 */
	Pictureurllarge,
	/**
	 * Include a URL to a picture of the item that is 800x800 pixels in size.
	 */
	Pictureurlsupersize,
	/**
	 * Include information about the seller in the response.
	 */
	Sellerinfo,
	/**
	 * Include information about the seller's eBay store in the response.
	 */
	Storeinfo,
	/**
	 * Include the unitPrice container with unit type and quantity information used for per-unit pricing (on eBay EU
	 * sites only).
	 */
	Unitpriceinfo
}
