package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.enums.UnitOfMeasurement;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
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

	@NotBlank(message = "Dish selection is mandatory")
	private String dishId;

	private Double cookQuantity;

	@Valid
	@NotEmpty(message = "Ingredients selection is mandatory")
	private List<RecipeIngredientRequestDto> ingredients;

}
