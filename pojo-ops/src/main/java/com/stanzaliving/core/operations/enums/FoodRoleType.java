package com.stanzaliving.core.operations.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodRoleType {

	CITY_MANAGER("City Manager"),
	CITY_FB_MANAGER("City F&B Manager"),
	CLUSTER_MANAGER("Cluster Manager"),
	CENTRAL_FB_MANAGER("Central F&B Manager"),
	RESIDENT_CAPTAIN("Resident Captain"),
	FB_HEAD("F&B Head"),
	HEAD_CHEF("Head Chef"),
	CITY_CHEF_MANAGER("City Chef Manager"),
	PURCHASE_MANAGER("Purchase Manager"),
	STORE_MANAGER("Store Manager"),
	OPERATIONS_HEAD("Operations Head"),
	CENTRAL_OPS_MANAGER("Central Ops Manager"),
	ZONAL_HEAD("Zonal Head");

	private String roleType;

}