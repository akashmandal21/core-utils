package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodServeType {

	PACKAGED("Packaged", "Boxed"),
	NON_PACKAGED("Non-Packaged", "Buffet");

	private String serveTypeName;
	private String commonName;

}