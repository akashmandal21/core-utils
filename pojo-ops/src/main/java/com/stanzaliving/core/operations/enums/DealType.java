/**
 * 
 */
package com.stanzaliving.core.operations.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author manish.pareek
 *
 * @date 05-Feb-2021
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum DealType {

	FOOD("Food Only"),
	OPS("OPS Only"),
	FOOD_OPS("Food and OPS");

	private String dealType;

}

