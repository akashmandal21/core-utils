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
	FOOD_MENU_CATEGORY_V2("Food Menu Category", "foodmenucategory", "foodmenucategory"),
	WEEKLY_MENU("Weekly Menu", "FOOD_SERVICE", "WEEKLY_MENU"),
	WEEKLY_MENU_V2("Weekly Menu", "FOOD_SERVICE", "WEEKLY_MENU"),
	SUPPORT_TEMPLATE("Support Template", "support-service", "SUPPORT_TEMPLATE");

	private final String value;
	private final String commentServiceName;
	private final String commentContextType;

	public static final List<ApprovalEntityType> micormarketUuidBasedListing = Arrays.asList(FOOD_MENU_CATEGORY, WEEKLY_MENU);
}