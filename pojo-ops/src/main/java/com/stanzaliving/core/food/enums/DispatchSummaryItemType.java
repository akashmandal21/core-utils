package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DispatchSummaryItemType {

	VEG("Veg Meals"), NONVEG("Non Veg Meals"), STAFF("Staff Meals"), VAS_VEG("Vas Veg"), VAS_NON_VEG("Vas Non-Veg");

	private String mealName; 

}
