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
	RC("RC");

	private String roleType;

}