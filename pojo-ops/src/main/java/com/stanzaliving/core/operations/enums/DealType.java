/**
 * 
 */
package com.stanzaliving.core.operations.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author manish.pareek
 *
 * @date 05-Feb-2021
 */
@Getter
@AllArgsConstructor
public enum DealType {

	FOOD("Food Only"),
	OPS("OPS Only"),
	FOOD_OPS("Food and OPS");

	private String dealType;

}

