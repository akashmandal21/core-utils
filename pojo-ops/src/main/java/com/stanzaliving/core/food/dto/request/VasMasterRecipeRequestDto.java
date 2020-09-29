package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
	@NotNull(message = "Cook Quantity selection is mandatory")
	private Double cookQuantity;

	private Double grammagePerPax;

	private Integer quantityPerPax;

	@NotEmpty(message = "Ingredients selection are mandatory")
	private List<RecipeIngredientRequestDto> ingredients;

}
