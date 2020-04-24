package com.stanzaliving.taskmaster.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatus {

	PENDING("Not Started"),STARTED("In Progress"),COMPLETED("Done");

	private String name;
}

