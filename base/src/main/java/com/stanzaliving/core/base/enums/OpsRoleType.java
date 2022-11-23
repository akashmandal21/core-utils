/**
 * 
 */
package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 01-Oct-2020
 *
 **/
@Getter
@AllArgsConstructor
public enum OpsRoleType {

	OPERATIONS_HEAD("Operations Head", Department.OPS, AccessLevel.COUNTRY),
	CENTRAL_OPS_MANAGER("Central Ops Manager", Department.OPS, AccessLevel.COUNTRY),
	COUNTRY_OPS_MANAGER("Country - Ops Manager", Department.OPS, AccessLevel.COUNTRY),
	ZONAL_HEAD("Zonal Head", Department.OPS, AccessLevel.CITY),
	CITY_MANAGER("City Manager", Department.OPS, AccessLevel.CITY),
	CLUSTER_MANAGER("Cluster Manager", Department.OPS, AccessLevel.MICROMARKET),
	RESIDENT_CAPTAIN("Resident Captain", Department.OPS, AccessLevel.RESIDENCE),

	CITY_FOOD_BUDGET_PLANNING("City - Food Budget Planning", Department.OPS, AccessLevel.CITY),
	COUNTRY_FOOD_BUDGET_PLANNING("Country - Food Budget Planning", Department.OPS, AccessLevel.COUNTRY),
	COUNTRY_FOOD_BUDGET_APPROVAL("Country - Food Budget Approval", Department.OPS, AccessLevel.COUNTRY),

	COUNTRY_OPS_BUDGETING("Ops Budgeting", Department.OPS, AccessLevel.COUNTRY),
	COUNTRY_OPS_BUDGETING_VIEW_ONLY("Ops Budgeting View Only", Department.OPS, AccessLevel.COUNTRY),

	COUNTRY_FOOD_ORDER_PLANNING("Country - Food Order Planning", Department.OPS, AccessLevel.COUNTRY),
	ZONE_FOOD_ORDER_PLANNING("Zone - Food Order Planning", Department.OPS, AccessLevel.REGION),
	CITY_FOOD_ORDER_PLANNING("City - Food Order Planning", Department.OPS, AccessLevel.CITY),
	MICROMARKET_FOOD_ORDER_PLANNING("Micromarket - Food Order Planning", Department.OPS, AccessLevel.MICROMARKET),

	EMAIL_CC_FOOD_ORDER_DETAILS("Email CC - Food Order Details", Department.OPS, AccessLevel.COUNTRY),
	EMAIL_CC_FOOD_ORDER_REMINDER("Email CC - Food Order Reminder", Department.OPS, AccessLevel.COUNTRY),

	EMAIL_CC_ELECTRICITY_METER_READING_REMINDER("Email CC - Electricity Meter Reading Reminder", Department.OPS, AccessLevel.COUNTRY),

	COUNTRY_FOOD_ORDER("Country - Food Order", Department.OPS, AccessLevel.COUNTRY),
	CITY_FOOD_ORDER("City - Food Order", Department.OPS, AccessLevel.CITY),
	MICROMARKET_FOOD_ORDER("Micromarket - Food Order", Department.OPS, AccessLevel.MICROMARKET);

	private String roleType;

	private Department department;

	private AccessLevel accessLevel;
}