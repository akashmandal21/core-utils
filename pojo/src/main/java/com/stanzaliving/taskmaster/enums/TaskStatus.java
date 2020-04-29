package com.stanzaliving.taskmaster.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatus {

	PENDING("Not Started"),STARTED("In Progress"),COMPLETED("Done");

	private String name;
	
	private static Map<TaskStatus, String> statusMap = new HashMap<>();

	static {
		statusMap.put(COMPLETED, COMPLETED.getName());
		statusMap.put(STARTED, STARTED.getName());
		statusMap.put(PENDING, PENDING.getName());
	}
	
	public static Map<TaskStatus, String> getStatusMap(){
		return statusMap;
	}
}

