package com.stanzaliving.transformations.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UnitType {

	NUMBER("nos."),
	METERS("mtrs"),
	CUBIT_FEET("cu.ft."),
	SQUARE_FEET("sq.ft."),
	KILOGRAM("kg"),
	RFT("Running Feet"),
	LS("Lump sum"),
	PER_BED("Per Bed"),
	MANDAYS("Mandays"),
	LTS("ltr"),
	PULSE("Pulse"),
	FLAT_RATE("Flat Rate"),
	PERCENTAGE("Percentage"),
	LITERS("Ltrs");

	private String unitName;

	private static Map<String, UnitType> unitByNameMap = new HashMap<>();

	static {

		for (UnitType unitType : UnitType.values()) {
			unitByNameMap.put(unitType.getUnitName(), unitType);
		}
	}

	public static UnitType getUnitTypeByName(String unitName) {
		return unitByNameMap.get(unitName);
	}
	
	public static Map<String, UnitType> getUnitByNameMap(){
		return unitByNameMap;
	}

	public static Map<String, UnitType> getUnitByNameMap(){
		return unitByNameMap;
	}
}