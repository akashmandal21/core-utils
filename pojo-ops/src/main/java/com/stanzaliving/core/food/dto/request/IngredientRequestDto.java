package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.IngredientType;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 20-Aug-2020
 *
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientRequestDto extends AbstractDto {

	@NotBlank(message = "Ingredient Name is mandatory")
	private String ingredientName;

	@NotNull(message = "Ingredient type is mandatory")
	private IngredientType ingredientType;

	@NotNull(message = "unit of measurement is mandatory")
	private UnitOfMeasurement unitOfMeasurement;
}