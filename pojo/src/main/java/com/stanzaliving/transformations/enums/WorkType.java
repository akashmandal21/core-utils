package com.stanzaliving.transformations.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum WorkType {

	ELECTRICAL("Electrical"),
	DESIGN("Design");

	private String name;

	private WorkType(String name) {
		this.name = name;
	}

	private static Map<String, WorkType> workByNameMap = new HashMap<>();

	static {

		for (WorkType workType : WorkType.values()) {
			workByNameMap.put(workType.getName(), workType);
		}
	}

	public static WorkType getWorkTypeByName(String name) {
		return workByNameMap.get(name);
	}

}