package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 14-May-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryVendorUpdateDto {

	private MealType mealType;

	private boolean status;

	private Double residenceVegCost;

	private Double residenceNonVegCost;

	private Double nonStanzaStaffVegCost;

	private Double nonStanzaStaffNonVegCost;
}