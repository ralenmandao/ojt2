package com.ralen.helper.model

/**
 * Contains the specifications for limiting the number of items returned by a find request. Use itemFilter to
 * specify name/value pairs. You can include multiple item filters in a single request.
 */
public class ItemFilter {
	/**
	 * Specify the name of the item filter you want to use. The itemFilter name must have a corresponding value. You
	 * can apply multiple itemFilter Name/Value pairs in a single request.
	 */
	ItemFilterType name
	/**
	 * In addition to filter Name/Value pairs, some itemFilters use an additional parameter Name/Value pair.
	 * Specifically, filters that use currency values (MaxPrice and MinPrice) make use of addition parameters. When
	 * you use these itemFilters, set paramName to Currency and provide the currency ID in paramValue. For example,
	 * if you use the MaxPrice itemFilter, you will need to specify a parameter Name of Currency with a parameter
	 * Value that specifies the type of currency desired. Note that for MaxPrice and MinPrice itemFilters, the
	 * default value for paramName is Currency.
	 */
	String paramName
	/**
	 * The currency value associated with the respective itemFilter parameter Name. Usually paramName is set to
	 * Currency and paramValue is set to the currency type in which the monetary transaction occurs. Note that for
	 * MaxPrice and MinPrice itemFilters, the default value for paramValue is USD.
	 */
	String paramValue
	/**
	 * The value associated with the respective item filter name. Allowed values and datatypes vary for a given
	 * filter name.
	 */
	String value
}
