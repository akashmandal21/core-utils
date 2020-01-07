/**
 * 
 */
package com.stanzaliving.core.operations.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 31-Dec-2019
 *
 **/
@Getter
@AllArgsConstructor
public enum FoodItemFrequency {

	DAY("day"),
	WEEK("week");

	private String viewName;
}