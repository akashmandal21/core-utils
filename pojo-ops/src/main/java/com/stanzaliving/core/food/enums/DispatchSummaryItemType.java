package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DispatchSummaryItemType {

	VEG("Veg Meals", "Veg"), 
	NONVEG("Non Veg Meals", "Non-Veg"), 
	STAFF("Non-SL Staff Meals", "Non-SL Staff"),
	VAS_VEG("VAS Veg", "VAS Veg"),
	VAS_NON_VEG("VAS Non-Veg", "VAS Non-Veg");

	private String mealName; 
	private String labelName;

}
