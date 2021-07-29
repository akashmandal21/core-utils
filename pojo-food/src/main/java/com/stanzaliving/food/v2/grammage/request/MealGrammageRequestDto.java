package com.stanzaliving.food.v2.grammage.request;

import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 20-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealGrammageRequestDto extends GrammageStatusRequestDto {

	@NotNull(message = "Meal selection is mandatory")
	private MealType mealType;

	@NotNull(message = "Food serve type is mandatory")
	private FoodServeType foodServeType;

}
