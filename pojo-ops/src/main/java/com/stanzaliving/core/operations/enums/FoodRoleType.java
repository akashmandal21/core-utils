package com.stanzaliving.core.operations.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodRoleType {

	CITY_MANAGER("CITY MANAGER"),
	CITY_FB_MANAGER("CITY F&B MANAGER"),
	CLUSTER_MANAGER("CLUSTER MANAGER");

	private String roleType;

}
