package com.stanzaliving.core.operations.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Frequency {

	DAILY("Daily"),
	WEEKLY("Weekly"),
	MONTHLY("Monthly");

	private String simpleName;
}