package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ProductListingDetailsType {
	BrandMPNType BrandMPN;
	List<String> Copyright;
	URL DetailsURL;
	String EAN;
	boolean IncludeeBayProductDetails;
	boolean IncludeStockPhotoURL;
	String ISBN;
	URL ProductDetailsURL;
	String ProductID;
	String ProductReferenceID;
	boolean ReturnSearchResultOnDuplicates;
	URL StockPhotoURL;
	TicketListingDetailsType TicketListingDetails;
	String UPC;
	boolean UseFirstProduct;
	boolean UseStockPhotoURLAsGallery;
}
