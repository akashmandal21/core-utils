package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DispatchSummaryItemType {

	VEG("Veg Meals", "Veg", 1),
	NONVEG("Non Veg Meals", "Non-Veg", 2),
	VAS_VEG("VAS Veg", "VAS Veg", 3),
	VAS_NON_VEG("VAS Non-Veg", "VAS Non-Veg", 4),
	STAFF("Non-SL Staff Meals", "Staff", 5);

	private String mealName;
	private String labelName;
	private Integer order;

	public static boolean isStudentSummary(DispatchSummaryItemType itemType) {
		return VEG == itemType || NONVEG == itemType;
	}

	public static boolean isStaffSummary(DispatchSummaryItemType itemType) {
		return STAFF == itemType;
	}

	public static boolean isVasSummary(DispatchSummaryItemType itemType) {
		return VAS_VEG == itemType || VAS_NON_VEG == itemType;
	}
}