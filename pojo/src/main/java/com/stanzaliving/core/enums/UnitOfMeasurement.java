package com.stanzaliving.core.enums;

import com.stanzaliving.core.base.common.dto.ListingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum UnitOfMeasurement {

	KILOGRAM("Kg"),
	LITRE("Ltr"),
	NUMBER("Nos");

	private String unitName;

	private static List<ListingDto> unitMeasurementListing = new ArrayList<>();

	private static Map<String, UnitOfMeasurement> unitOfMeasurementNameMap = new HashMap<>();

	static {

		for (UnitOfMeasurement unitOfMeasurement : UnitOfMeasurement.values()) {
			unitMeasurementListing.add(ListingDto.builder().id(unitOfMeasurement.name()).name(unitOfMeasurement.getUnitName()).build());
			unitOfMeasurementNameMap.putIfAbsent(unitOfMeasurement.getUnitName(), unitOfMeasurement);
		}
	}

	public static List<ListingDto> getUnitMeasurementListing() {
		return unitMeasurementListing;
	}

	public static Map<String, UnitOfMeasurement> getUnitOfMeasurementNameMap() {
		return unitOfMeasurementNameMap;
	}

	public static UnitOfMeasurement getUnitOfMeasurementByUnitName(String unitName) {
		return unitOfMeasurementNameMap.get(unitName);
	}
}