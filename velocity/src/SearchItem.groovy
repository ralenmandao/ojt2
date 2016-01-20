package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.*
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class SearchItem {
	List<ItemAttribute> attribute;
	boolean autoPay;
	String charityId;
	String compatibility;
	Condition condition;
	String country;
	DiscountPriceInfo discountPriceInfo;
	Distance distance;
	List<String> eekStatus;
	GalleryInfoContainer galleryInfoContainer;
	List<URL> galleryPlusPictureURL;
	URL galleryURL;
	String globalId;
	boolean isMultiVariationListing;
	String itemId;
	ListingInfo listingInfo;
	String location;
	List<String> paymentMethod;
	URL pictureURLLarge;
	URL pictureURLSuperSize;
	String postalCode;
	Category primaryCategory;
	ProductId productId;
	boolean returnsAccepted;
	Category secondaryCategory;
	SellerInfo sellerInfo;
	SellingStatus sellingStatus;
	ShippingInfo shippingInfo;
	Storefront storeInfo;
	String subtitle;
	String title;
	boolean topRatedListing;
	UnitPriceInfo unitPrice;
	URL viewItemURL;
}
