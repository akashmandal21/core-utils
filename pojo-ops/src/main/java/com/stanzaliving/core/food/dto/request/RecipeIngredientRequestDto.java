package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 14-Aug-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class RecipeIngredientRequestDto {

	@NotBlank(message = "Ingredients selection is mandatory")
	private String ingredientId;

	@NotBlank(message = "Ingredient name is mandatory")
	private String ingredientName;

	@NotNull(message = "Ingredient quantity is required for all ingredients")
	private Double quantity;

}
