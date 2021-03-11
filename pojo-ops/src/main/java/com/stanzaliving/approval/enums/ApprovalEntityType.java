package com.stanzaliving.approval.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ApprovalEntityType {
	SERVICE_MIX("Service Mix", "service-mix", "service-mix"),
	SESSION_UNDERWRITTEN("Stabilised Underwritten", "underwritten", "underwritten"),
	MONTHLY_UNDERWRITTEN("Monthly Underwritten", "underwritten", "underwritten"),
	FOOD_MENU_CATEGORY("Food Menu Category", "foodMenuCategory", "foodMenuCategory"),
	WEEKLY_MENU("Weekly Menu", "FOOD_SERVICE", "WEEKLY_MENU"),
	;

	private final String value;
	private final String commentServiceName;
	private final String commentContextType;

	public static final List<ApprovalEntityType> micormarketUuidBasedListing = Arrays.asList(FOOD_MENU_CATEGORY, WEEKLY_MENU);
}
