package com.stanzaliving.core.base.enums;

import com.stanzaliving.core.base.common.dto.ListingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum UnitOfMeasurement {

	KILOGRAM("Kg"),
	LITRE("Ltr"),
	NUMBER("Nos");

	private String unitName;

	private static List<ListingDto> unitMeasurementListing = new ArrayList<>();

	static {

		for (UnitOfMeasurement unitOfMeasurement : UnitOfMeasurement.values()) {
			unitMeasurementListing.add(ListingDto.builder().id(unitOfMeasurement.name()).name(unitOfMeasurement.getUnitName()).build());
		}
	}

	public static List<ListingDto> getUnitMeasurementListing() {
		return unitMeasurementListing;
	}
}