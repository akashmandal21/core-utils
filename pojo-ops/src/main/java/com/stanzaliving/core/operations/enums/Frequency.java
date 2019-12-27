package com.stanzaliving.core.operations.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Frequency {

	DAILY("Day"),
	WEEKLY("Week"),
	MONTHLY("Month");

	private String simpleName;
}