/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum IngredientUnit {
	
	KILOGRAM("Kg"),
	GRAM("Gm"),
	LITRE("Lt"),
	MILILITRE("Ml");

	private String IngredientUnit;

}
