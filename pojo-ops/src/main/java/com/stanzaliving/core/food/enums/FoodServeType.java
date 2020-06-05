package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodServeType {

	PACKAGED("Packaged"),
	NON_PACKAGED("Non-Packaged");

	private String serveTypeName;

}