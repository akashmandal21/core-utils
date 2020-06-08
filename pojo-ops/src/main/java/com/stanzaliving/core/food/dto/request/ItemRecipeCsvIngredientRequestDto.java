/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.food.dto.request;

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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemRecipeCsvIngredientRequestDto {

	private String itemSku;
	private String ingredientId;
	private String ingredientName;
	private String quantity;
	private String unit;

}