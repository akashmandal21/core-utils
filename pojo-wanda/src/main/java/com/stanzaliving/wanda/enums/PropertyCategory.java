package com.stanzaliving.wanda.enums;

import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.core.enums.ResidenceType;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PropertyCategory {
	SUITES("Suites"), STELLO("Stello"), MANAGED_APARTMENTS("Managed Apartments");

	String name;

	private static final Map<ResidenceType, PropertyCategory> propertyCategory = new HashMap<>();

	static {
		propertyCategory.put(ResidenceType.SUITS, PropertyCategory.SUITES);
		propertyCategory.put(ResidenceType.SCHOLAR, PropertyCategory.STELLO);
	}

	public static PropertyCategory get(ResidenceType id) {
		return propertyCategory.get(id);
	}
}
