
package com.stanzaliving.core.operations.enums;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodRoleType {

	OPERATIONS_HEAD("Operations Head", Department.OPS, AccessLevel.COUNTRY),
	CENTRAL_OPS_MANAGER("Central Ops Manager", Department.OPS, AccessLevel.COUNTRY),
	ZONAL_HEAD("Zonal Head", Department.OPS, AccessLevel.CITY),
	CITY_MANAGER("City Manager", Department.OPS, AccessLevel.CITY),
	CLUSTER_MANAGER("Cluster Manager", Department.OPS, AccessLevel.MICROMARKET),
	RESIDENT_CAPTAIN("Resident Captain", Department.OPS, AccessLevel.RESIDENCE),
	CITY_FOOD_BUDGET_PLANNING("City - Food Budget Planning", Department.OPS, AccessLevel.CITY),
	COUNTRY_FOOD_BUDGET_PLANNING("Country - Food Budget Planning", Department.OPS, AccessLevel.COUNTRY),
	COUNTRY_FOOD_BUDGET_APPROVAL("Country - Food Budget Approval", Department.OPS, AccessLevel.COUNTRY),

	CENTRAL_FB_MANAGER("Central F&B Manager", Department.FOOD_OPS, AccessLevel.COUNTRY),
	FB_HEAD("F&B Head", Department.FOOD_OPS, AccessLevel.COUNTRY),
	HEAD_CHEF("Head Chef", Department.FOOD_OPS, AccessLevel.COUNTRY),
	VENDOR_PRICE_APPROVER("Country - Vendor Price Approver", Department.FOOD_OPS, AccessLevel.COUNTRY),
	CITY_CHEF_MANAGER("City Chef Manager", Department.FOOD_OPS, AccessLevel.CITY),
	CITY_MENU_CREATION("City - Menu Creation", Department.FOOD_OPS, AccessLevel.CITY),
	PURCHASE_MANAGER("Purchase Manager", Department.FOOD_OPS, AccessLevel.CITY),
	STORE_MANAGER("Store Manager", Department.FOOD_OPS, AccessLevel.CITY),
	CITY_FOOD_PREPARATION("City - Food Preparation", Department.FOOD_OPS, AccessLevel.CITY),
	COUNTRY_MENU_CATEGORY_APPROVER_L1("Country - food menu category L1 Approver", Department.FOOD_OPS, AccessLevel.COUNTRY),
	COUNTRY_MENU_CATEGORY_APPROVER_L2("Country - food menu category L2 Approver", Department.FOOD_OPS, AccessLevel.COUNTRY),

	EMAIL_CC_FOOD_ORDER_DETAILS("Email CC - Food Order Details", Department.OPS, AccessLevel.COUNTRY),
	EMAIL_CC_FOOD_ORDER_REMINDER("Email CC - Food Order Reminder", Department.OPS, AccessLevel.COUNTRY),
	EMAIL_CC_MICROMARKET_FOOD_ORDER("Micromarket - Food Order", Department.OPS, AccessLevel.MICROMARKET),
	EMAIL_CC_FOOD_MENU_CREATED("Email CC - Food Menu Created", Department.FOOD_OPS, AccessLevel.COUNTRY),
	EMAIL_CC_FOOD_MENU_SUBMITTED("Email CC - Food Menu Submitted", Department.FOOD_OPS, AccessLevel.COUNTRY),
	EMAIL_CC_FOOD_MENU_APPROVED("Email CC - Food Menu Approved", Department.FOOD_OPS, AccessLevel.COUNTRY),
	EMAIL_CC_FOOD_MENU_REJECTED("Email CC - Food Menu Rejected", Department.FOOD_OPS, AccessLevel.COUNTRY),
	EMAIL_CC_FOOD_MENU_CREATION_REMINDER("Email CC - Food Menu Creation Reminder", Department.FOOD_OPS, AccessLevel.COUNTRY),
	EMAIL_CC_FOOD_MENU_WEEKLY_SUMMARY("Email CC - Food Menu Weekly Summary", Department.FOOD_OPS, AccessLevel.COUNTRY),
	EMAIL_CC_VENDOR_PRICE_APPROVED("Email CC - Vendor Price Approved", Department.FOOD_OPS, AccessLevel.COUNTRY),
	EMAIL_CC_FOOD_MENU_CATEGORY_APPROVED("Email CC - Food Menu Category Approved", Department.FOOD_OPS, AccessLevel.COUNTRY),

	HOSTEL_MENU_CHANGE_COST_APPROVER("Country - Hostel Menu Change Cost Approver", Department.FOOD_OPS, AccessLevel.COUNTRY),
	HOSTEL_MENU_CHANGE_NON_COST_APPROVER("Country - Hostel Menu Change Non Cost Approver", Department.FOOD_OPS, AccessLevel.COUNTRY),
	EMAIL_CC_HOSTEL_MENU_CHANGE_APPROVED("Email CC - Hostel Menu Change Approved", Department.FOOD_OPS, AccessLevel.COUNTRY);

	private String roleType;

	private Department department;

	private AccessLevel accessLevel;

}