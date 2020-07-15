package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DispatchSummaryItemType {

	VEG("Veg Meals", "Veg"), 
	NONVEG("Non Veg Meals", "Non-Veg"), 
	STAFF("Non-SL Staff Meals", "Non-SL Staff"),
	SL_STAFF("SL Staff Meals", "SL Staff"),
	VAS_VEG("Vas Veg", "Vas Veg"),
	VAS_NON_VEG("Vas Non-Veg", "Vas Non-Veg");

	private String mealName; 
	private String labelName;

}
