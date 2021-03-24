/**
 * 
 */
package com.stanzaliving.booking;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum DealType {

	FOOD("Food Only"),
	OPS("OPS Only"),
	FOOD_OPS("Food and OPS");

	private String dealType;

}

