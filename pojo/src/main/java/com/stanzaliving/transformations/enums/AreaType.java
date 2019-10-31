package com.stanzaliving.transformations.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum AreaType {

	ROOM("Room"),
	COMMON("Common Area"),
	BOH("Back of House");

	private String name;

	private AreaType(String name) {
		this.name = name;
	}

	private static Map<String, AreaType> areaByNameMap = new HashMap<>();

	static {

		for (AreaType areaType : AreaType.values()) {
			areaByNameMap.put(areaType.getName(), areaType);
		}
	}

	public static AreaType getAreaTypeByName(String name) {
		return areaByNameMap.get(name);
	}

}