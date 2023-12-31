package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.enums.FoodOrderType;
import com.stanzaliving.core.food.enums.FrontendVisibleType;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 26-Nov-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OrderNudgeFeedbackOptions extends VasOrderFeedbackOptions {

	private String nudgeId;

	private boolean optional;

	private EnumListing<MealType> meal;
	
	private EnumListing<FoodOrderType> foodOrderType;

	private FrontendVisibleType frontendVisibleType;
	
	private String mealName;
}