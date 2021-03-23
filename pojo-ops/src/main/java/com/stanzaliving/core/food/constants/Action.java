package com.stanzaliving.core.food.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Action {
	ADDED("Added"),
	DELETED("Deleted"),
	UPDATED("Updated");
	private final String action;
}
