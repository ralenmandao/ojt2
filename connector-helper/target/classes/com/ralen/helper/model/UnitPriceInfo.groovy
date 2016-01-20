package com.ralen.helper.model

/**
 * This type provides information about the weight, volume or other quantity measurement of a listed item. The
 * European Union requires listings for certain types of products to include the price per unit so buyers can
 * accurately compare prices. eBay uses the UnitType and UnitQuantity values and the item's listed price to
 * calculate and display the per-unit price on eBay EU sites.
 */
public class UnitPriceInfo {
	/**
	 * Number of units of size, weight, volume or count of the specified unit type for the item. eBay divides the
	 * item price by this number to get the price per unit to be displayed in the item listing for comparison
	 * purposes.
	 */
	double quantity
	/**
	 * Designation of size, weight, volume or count to be used to specify the unit quantity of the item. This value
	 * can be one of the following:  Kg 100g 10g L 100ml 10ml M M2 M3 Unit
	 */
	String type
}
