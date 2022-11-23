package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.enums.UnitOfMeasurement;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

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
public class ItemRecipeRequestDto {

	private Integer cookQuantity;

	private Double grammagePerPax;

	@Valid
	@NotNull(message = "Ingredients are required for saving a dish")
	private List<RecipeIngredientRequestDto> ingredients;

}
