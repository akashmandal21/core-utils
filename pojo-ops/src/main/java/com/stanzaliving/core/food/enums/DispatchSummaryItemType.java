package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DispatchSummaryItemType {

	VEG("Veg Meals", "Veg",1),
	NONVEG("Non Veg Meals", "Non-Veg",2),
	STAFF("Non-SL Staff Meals", "Non-SL Staff",5),
	VAS_VEG("VAS Veg", "VAS Veg",3),
	VAS_NON_VEG("VAS Non-Veg", "VAS Non-Veg",4);

	private String mealName;
	private String labelName;
	private Integer order;
}
