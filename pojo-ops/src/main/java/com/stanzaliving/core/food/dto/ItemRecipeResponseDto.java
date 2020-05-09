/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class ItemRecipeResponseDto {

	private String uuid;
	private String siteId;
	private String itemId;
	private String ingredientId;
	private String ingredientName;
	private String ingredientUnit;
	private Double ingredientPrice;
	private Double ingredientUnitQty;
	private Double ingredientUnitAmount;

}
