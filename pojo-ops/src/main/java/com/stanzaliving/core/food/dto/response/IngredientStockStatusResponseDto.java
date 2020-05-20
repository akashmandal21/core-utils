/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.food.dto.response;

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
public class IngredientStockStatusResponseDto {

	private String vendorId;
	private String ingredientId;
	private String ingredientUnit;
	private Double ingredientQty;

}