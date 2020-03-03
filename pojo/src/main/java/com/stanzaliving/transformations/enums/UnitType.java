package com.stanzaliving.transformations.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum UnitType {

	NUMBER("nos."),
	METERS("mtrs"),
	CUBIT_FEET("cu.ft."),
	SQUARE_FEET("sq.ft."),
	KILOGRAM("kg");

	private String unitName;

	private UnitType(String unitName) {
		this.unitName = unitName;
	}

	private static Map<String, UnitType> unitByNameMap = new HashMap<>();

	static {

		for (UnitType unitType : UnitType.values()) {
			unitByNameMap.put(unitType.getUnitName(), unitType);
		}
	}

	public static UnitType getUnitTypeByName(String unitName) {
		return unitByNameMap.get(unitName);
	}

}