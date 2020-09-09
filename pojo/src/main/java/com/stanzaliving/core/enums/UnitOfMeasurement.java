package com.stanzaliving.core.enums;

import com.stanzaliving.core.base.common.dto.ListingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public enum UnitOfMeasurement {

	KILOGRAM("Kg"),
	LITRE("Ltr"),
	NUMBER("Nos"),
	GRAM("gm"),
	MILI_LITRE("ml");

	private String unitName;

	private static List<ListingDto> unitMeasurementListing = new ArrayList<>();

	private static List<ListingDto> greaterUnitMeasurementListing = new ArrayList<>();

	private static Map<String, UnitOfMeasurement> unitOfMeasurementNameMap = new HashMap<>();

	private static Map<String, UnitOfMeasurement> unitOfMeasurementStrMap = new HashMap<>();

	private static Map<UnitOfMeasurement, UnitOfMeasurement> shortUnitsMap = new HashMap<>();

	private static Map<UnitOfMeasurement, UnitOfMeasurement> greaterUnitsMap = new HashMap<>();

	static {

		for (UnitOfMeasurement unitOfMeasurement : UnitOfMeasurement.values()) {
			unitMeasurementListing.add(ListingDto.builder().id(unitOfMeasurement.name()).name(unitOfMeasurement.getUnitName()).build());
			unitOfMeasurementNameMap.putIfAbsent(unitOfMeasurement.getUnitName(), unitOfMeasurement);
			unitOfMeasurementStrMap.putIfAbsent(unitOfMeasurement.name(), unitOfMeasurement);
		}

		createShortUnitsMap();

		createGreaterUnitMap();

		createGreaterUnitListing();

	}

	private static void createGreaterUnitListing() {

		Set<UnitOfMeasurement> greaterUnits = greaterUnitsMap.keySet();

		for (UnitOfMeasurement unitOfMeasurement: greaterUnits) {
			greaterUnitMeasurementListing.add(ListingDto.builder().id(unitOfMeasurement.name()).name(unitOfMeasurement.getUnitName()).build());
		}

	}

	private static void createShortUnitsMap() {
		shortUnitsMap.put(UnitOfMeasurement.MILI_LITRE, UnitOfMeasurement.LITRE);
		shortUnitsMap.put(UnitOfMeasurement.GRAM, UnitOfMeasurement.KILOGRAM);
		shortUnitsMap.put(UnitOfMeasurement.NUMBER, UnitOfMeasurement.NUMBER);
	}

	private static void createGreaterUnitMap() {
		greaterUnitsMap.put(UnitOfMeasurement.LITRE, UnitOfMeasurement.MILI_LITRE);
		greaterUnitsMap.put(UnitOfMeasurement.KILOGRAM, UnitOfMeasurement.GRAM);
		greaterUnitsMap.put(UnitOfMeasurement.NUMBER, UnitOfMeasurement.NUMBER);
	}


	public static List<ListingDto> getUnitMeasurementListing() {
		return unitMeasurementListing;
	}

	public static List<ListingDto> getGreaterUnitMeasurementListing() {
		return greaterUnitMeasurementListing;
	}

	public static Map<String, UnitOfMeasurement> getUnitOfMeasurementNameMap() {
		return unitOfMeasurementNameMap;
	}

	public static UnitOfMeasurement getUnitOfMeasurementByUnitName(String unitName) {
		return unitOfMeasurementNameMap.get(unitName);
	}

	public static UnitOfMeasurement getUnitOfMeasurementByName(String unitEnumName) {
		return unitOfMeasurementStrMap.get(unitEnumName);
	}

	public static UnitOfMeasurement getShortUnit(UnitOfMeasurement greaterUnit) {
		return greaterUnitsMap.get(greaterUnit);
	}

	public static UnitOfMeasurement getGreaterUnit(UnitOfMeasurement shortUnit) {
		return shortUnitsMap.get(shortUnit);
	}
}