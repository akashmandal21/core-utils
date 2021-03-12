package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.dto.request.RecipeIngredientRequestDto;
import com.stanzaliving.core.food.enums.RecipeType;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RecipePriceCalculatorPDto {
	@NotNull(message = "Recipe Type is mandatory")
	private RecipeType recipeType;
	@NotNull(message = "Cook Quantity is mandatory")
	private Double cookQuantity;
	private Double standardQuantity;
	@NotNull(message = "Ingredient(s) are mandatory")
	private List<RecipeIngredientRequestDto> ingredients;
}
