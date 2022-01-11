package com.stanzaliving.approval.enums;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

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
	SUPPORT_TEMPLATE("Support Template", "support-service", "SUPPORT_TEMPLATE"),
	MONTHLY_BUDGET_MENU_PLANNING("Food Monthly Planning", "FOOD_SERVICE", "MONTHLY_BUDGET_MENU_PLANNING"),
	ELECTRICITY_BILL_SPLITTER("Electricity Bill Splitter", "ELECTRICITY_SERVICE", "ELECTRICITY_BILL_SPLITTER"),
	HK_BEAT_PLAN("House Keeping Beat plan", "HK_BEAT_PLAN", "HK_BEAT_PLAN");

	private final String value;
	private final String commentServiceName;
	private final String commentContextType;

	public static final List<ApprovalEntityType> micormarketUuidBasedListing = Arrays.asList(FOOD_MENU_CATEGORY, WEEKLY_MENU, HK_BEAT_PLAN);
}