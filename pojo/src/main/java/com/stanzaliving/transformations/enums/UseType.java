package com.stanzaliving.transformations.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum UseType {

	ELECTRONICS("Electronics"),
	LIGHTING("Lighting"),
	FURNITURE("Furniture");

	private String name;

	private UseType(String name) {
		this.name = name;
	}

	private static Map<String, UseType> useByNameMap = new HashMap<>();

	static {

		for (UseType useType : UseType.values()) {
			useByNameMap.put(useType.getName(), useType);
		}
	}

	public static UseType getUseTypeByName(String name) {
		return useByNameMap.get(name);
	}

}