package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class CategoryType {
	boolean AutoPayEnabled;
	boolean B2BVATEnabled;
	boolean BestOfferEnabled;
	boolean CatalogEnabled;
	String CategoryID;
	int CategoryLevel;
	String CategoryName;
	List<String> CategoryParentID;
	List<String> CategoryParentName;
	List<CharacteristicsSetType> CharacteristicsSets;
	boolean Expired;
	boolean IntlAutosFixedCat;
	String Keywords;
	boolean LeafCategory;
	boolean LSD;
	int NumOfItems;
	boolean ORPA;
	boolean ORRA;
	List<ExtendedProductFinderIDType> ProductFinderIDs;
	boolean ProductSearchPageAvailable;
	boolean SellerGuaranteeEligible;
	boolean Virtual;
}
