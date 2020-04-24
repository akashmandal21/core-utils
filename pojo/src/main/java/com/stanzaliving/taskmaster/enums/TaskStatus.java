package com.stanzaliving.taskmaster.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatus {

	PENDING("Pending"),STARTED("Started"),DELAYED("Delayed"),COMPLETED("Completed"),REOPENED("Reopened");

	private String name;
	
}

