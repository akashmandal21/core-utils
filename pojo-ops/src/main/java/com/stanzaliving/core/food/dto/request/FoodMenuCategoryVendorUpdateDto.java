package com.stanzaliving.core.food.dto.request;


import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
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

	private Double residentVegCost;

	private Double residentNonVegCost;

	private Double nonStanzaStaffVegCost;

	private Double nonStanzaStaffNonVegCost;
}
