package com.ralen.helper.model

/**
 * Container for the data of a single item that matches the search criteria. Finding API calls return an object
 * of this type, filled with the item's data.
 */
public class SearchItem {
	/**
	 * Contains a name/value pair defining an item attribute. Multiple attribute containers can be returned for an
	 * item.
	 */
	ItemAttribute attribute
	/**
	 * If true, the seller requires immediate payment for the item. If false (or not specified), immediate payment is
	 * not requested. Buyers must have a PayPal account to purchase items that require immediate payment. A seller
	 * can choose to require immediate payment for Fixed Price and Buy It Now listings. If a Buy It Now item ends as
	 * an auction (that is, if the Buy It Now option is removed due to bids being placed on the listing), the
	 * immediate payment requirement does not apply. Note: The value of the AutoPay flag indicates the seller's
	 * stated preference only. It does not indicate whether the listing is still a candidate for purchase via
	 * immediate payment. For example, if a listing receives bids and no longer qualifies for immediate payment, the
	 * value of the AutoPay flag does not change. Only applicable to items listed on PayPal-enabled sites and in
	 * categories that support immediate payment.
	 */
	boolean autoPay
	/**
	 * A unique identification number assigned by eBay to a registered non-profit charity organization.
	 */
	String charityId
	/**
	 * This field returns terms from the keywords in the request that match values in one of the item's compatible
	 * applications (vehicles). If the keywords match more than one compatible application for an item, the field
	 * returns "Two or more of your vehicles" to indicate multiple matches. For example, keyword queries that contain
	 * vehicle details, such as make and model (for example, Honda Accord), in addition to keywords for the part or
	 * accessory, will search through structured parts compatibility information for matching listings. If an item
	 * has a 2007 Honda Accord (any trim or engine) specified as a compatible application, and the item matches the
	 * part or accessory terms in the query, this field will return the matching terms from the query (i.e., Honda
	 * Accord). Parts compatibility is an eBay feature that uses structured data to associate compatible assemblies
	 * with parts and accessories listed on eBay. For example, parts compatibility enables sellers to specify
	 * accurately and comprehensively the vehicles on which a side mirror or a rim fit. Parts compatibility improves
	 * search relevancy and frees up item titles and descriptions for more useful descriptions of the part.
	 */
	String compatibility
	/**
	 * Contains information about the item's condition. Only returned when the seller listed the item with an item
	 * condition. Different categories can support different condition choices. If a listing is in two categories,
	 * the seller uses condition details that are supported in the primary category. Thus, even if two nearly
	 * identical items are found in the same category search, they could support different condition details if they
	 * have different primary categories. For example, suppose Seller A lists a concert T-shirt in clothing, and also
	 * in music accessories as the secondary category. Seller B lists an identical shirt in music accessories only.
	 * If you search against the music accessories category, you will find both items, but seller A's shirt may have
	 * condition details that are slightly different from seller B's shirt, because the listings have different
	 * primary categories.
	 */
	Condition condition
	/**
	 * Two-letter ISO 3166 country code to indicate the country where the item is located (for example, "US" for the
	 * United States or "GB" for the United Kingdom).
	 */
	String country
	/**
	 * Returns information on the item if it is listed as a Strikethrough Price (STP) or Minimum Advertised Price
	 * (MAP) item by the seller.
	 */
	DiscountPriceInfo discountPriceInfo
	/**
	 * The distance that the item is from the buyer, calculated using buyerPostalCode. The unit for distance varies
	 * by site, and is either miles or kilometers. If the country whose site you are searching uses kilometers to
	 * measure distance (for example, India/EBAY-IN), the unit is kilometers. If the site is either the US or UK, the
	 * distance unit is miles. This value is only returned for distance-based searches. You must specify a
	 * buyerPostalCode and either sort by Distance, or use a combination of the MaxDistance LocalSearch itemFilters.
	 */
	Distance distance
	/**
	 * Indicates the energy efficiency rating of the item. Energy efficiency ratings apply to products listed by
	 * commercial vendors in electronics categories only. Rating values are of the form A+++, A++, A+, A, B, C, D, E,
	 * F, or G. This field is only returned if the seller has specified the energy efficiency rating in the item
	 * specifics. Applicable to the eBay Germany site (EBAY-DE) only.
	 */
	String eekStatus
	/**
	 * Contains three URLs for item thumbnail images in standard sizes. Not returned if the item has no images. That
	 * is, if the item was not listed using a product identifier and the seller has not uploaded images, the
	 * container will not be returned, even when the outputSelector is set to GalleryInfo.
	 */
	GalleryInfoContainer galleryInfoContainer
	/**
	 * URL for the Gallery Plus image. The size of Gallery Plus images (up to 500 pixels on the longest side) is
	 * bigger than the size of standard gallery images. In site search results, you can view the Gallery Plus image
	 * by hovering over or clicking the Enlarge link or magnifying glass icon. This field is only returned when the
	 * seller has opted for the Gallery Plus option for the given item.
	 */
	anyURI galleryPlusPictureURL
	/**
	 * URL for the Gallery thumbnail image. Returned only if the seller uploaded images for the item or the item was
	 * listed using a product identifier.
	 */
	anyURI galleryURL
	/**
	 * The identifier for the site on which the item is listed. Returns a Global ID, which is a unique identifier
	 * that specifies the combination of the site, language, and territory. In other eBay APIs (such as the Shopping
	 * API), this value is know as the site ID.
	 */
	String globalId
	/**
	 * Returns true if the item is a multi-variation listing.
	 */
	boolean isMultiVariationListing
	/**
	 * The ID that uniquely identifies the item listing. eBay generates this ID when an item is listed. ID values are
	 * unique across all eBay sites.
	 */
	String itemId
	/**
	 * The format type of the listing, such as online auction, fixed price, or advertisement.
	 */
	ListingInfo listingInfo
	/**
	 * Physical location of the item, as specified by the seller. This gives a general indication from where the item
	 * will be shipped (or delivered).
	 */
	String location
	/**
	 * Identifies the payment method (or methods) the seller will accept for the item (such as PayPal). Note: If the
	 * seller accepts only PayPal, the buyer can still pay with a credit card. PayPal supports major credit cards.
	 * Payment methods are not applicable to eBay Real Estate advertisement listings or other Classified Ad listing
	 * formats.
	 */
	String paymentMethod
	/**
	 * URL to a picture of the item that is 400x400 pixels in size.
	 */
	anyURI pictureURLLarge
	/**
	 * URL to a picture of the item that is 800x800 pixels in size.
	 */
	anyURI pictureURLSuperSize
	/**
	 * The postal code where the listed item is located. This field is returned only if a postal code has been
	 * specified by the seller. eBay proximity and local search behavior can use the combination of buyerPostalCode
	 * and postalCode values.
	 */
	String postalCode
	/**
	 * Details about the first (or only) category in which the item is listed. Note that items can be listed in more
	 * than a single category.
	 */
	Category primaryCategory
	/**
	 * Unique identifier for the eBay catalog product with which the item was listed. An eBay catalog product
	 * consists of pre-filled Item Specifics, additional descriptive information, plus a stock photo (if available).
	 * These product details are used to pre-fill item information, which is used to describe the item and can also
	 * help surface the item in searches. eBay supports the following types of product ID types: ISBN, UPC, EAN, and
	 * ReferenceID (ePID, also known as an eBay Product Reference ID). ReferenceID values are returned when
	 * available. A UPC, ISBN, or EAN product identifier will be returned only when a ReferenceID is not available.
	 * This productId value can be used as input with findItemsByProduct to retrieve items that were listed with the
	 * specified eBay catalog product. This field is only returned when a product was used to list the item.
	 */
	ProductId productId
	/**
	 * This is set to true if the seller accepts return of the item.
	 */
	boolean returnsAccepted
	/**
	 * Details about the second category in which the item is listed. This element is not returned if the seller did
	 * not specify a secondary category.
	 */
	Category secondaryCategory
	/**
	 * Information about the item's seller. Only returned if SellerInfo is specified in the outputSelector field in
	 * the request.
	 */
	SellerInfo sellerInfo
	/**
	 * Specifies the item's selling status with regards to eBay's processing workflow.
	 */
	SellingStatus sellingStatus
	/**
	 * Container for data about a listing's shipping details.
	 */
	ShippingInfo shippingInfo
	/**
	 * Information about the eBay store in which the item is listed. Only returned if the item is listed in a store
	 * and StoreInfo is specified in the outputSelector field in the request.
	 */
	Storefront storeInfo
	/**
	 * Subtitle of the item. Only returned if the seller included a subtitle for the listing.
	 */
	String subtitle
	/**
	 * Name of the item as it appears in the listing title, or in search and browse results.
	 */
	String title
	/**
	 * Indicates whether the item listing is a Top-Rated Plus listing. A Top-Rated Plus listing must meet the
	 * following requirements: 14-day (or longer) return policy with Money Back option 1-day Handling Time or better
	 * Listed by a Top-Rated Seller This field is returned only for the US (EBAY-US) site.
	 */
	boolean topRatedListing
	/**
	 * Contains information about the weight, volume or other quantity measurement of a listed item. The European
	 * Union requires listings for certain types of products to include the price per unit so buyers can accurately
	 * compare prices. eBay uses the UnitInfo data and the item's listed price to calculate and display the per-unit
	 * price on eBay EU sites. Note: This information is currently required only for EU business sellers, and only
	 * for listings with a Buy It Now option.
	 */
	UnitPriceInfo unitPrice
	/**
	 * The URL to view this specific listing on eBay. The returned URL is optimized to support natural search. That
	 * is, the URL is designed to make items on eBay easier to find via popular internet search engines. The URL
	 * includes the item title along with other optimizations. If you enabled affiliate tracking in the call,
	 * viewItemURL contains a string that includes affiliate tracking information. Note: eBay URLs returned in
	 * fields, such as viewItemURL, are subject to syntax and other changes without notice. To avoid problems in your
	 * application when eBay alters the URL format, we advise you to avoid parsing eBay URLs programmatically. We
	 * strive to ensure that other fields in the response contain all the information that is encoded in the URL, and
	 * more.
	 */
	anyURI viewItemURL
}
