package com.ralen.helper.model

/**
 * Container for histogram fields.
 */
public class ConditionHistogram {
	/**
	 * The ID and name of a condition that was found in the item results.
	 */
	Condition condition
	/**
	 * The number of items found that match the condition. Only counts items where the seller specified the condition
	 * by using item.conditionId.
	 */
	int count
}
