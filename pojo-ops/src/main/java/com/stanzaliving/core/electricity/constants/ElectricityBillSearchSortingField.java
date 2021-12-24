package com.stanzaliving.core.electricity.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ElectricityBillSearchSortingField {

	PROPERTY_NAME("PropertyName"),
	CITY_NAME("CityName"),
	SOCIETY_NAME("SocietyName"),
	PENDING_BILLS_COUNT("PendingBillsCount"),
	PENDING_AMOUNT("PendingAmount"),
	LAST_UPDATED_BY("LastUpdatedBy");
	
    private final String field;
}
