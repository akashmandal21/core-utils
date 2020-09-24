package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 24-Sep-2020
 *
 * @version 1.0
 */
@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class VasMasterRecipeRequestDto {
	private Double cookQuantity;

	private List<RecipeIngredientRequestDto> ingredients;

}
