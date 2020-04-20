/**
 * 
 */
package com.stanzaliving.core.leadership.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
public enum SortFilterEnum {

	CREATED_AT("Added On"),
	L1_APPROVED_ON("L1 Approved On"),
	PROPERTY_NAMED_ON("Named On"),
	CITY("City"),
	MICROMARKET("Micromarket"),
	ROOMS("Rooms"),
	BEDS("Beds"),
	RENT_PER_BED("Rent Per Bed"),
	LL_HANDOVER_DATE("Ll Handover Date"),
	CURRENT_STATUS("Current Status");
	
	private String name;
	
	private SortFilterEnum(String name) {
		this.name = name;
	}
	
	public static Map<SortFilterEnum, String> getSortFilters() {
		
		Map<SortFilterEnum, String> sortFilterMap = new HashMap<>();
		
		for(SortFilterEnum sortFilter : SortFilterEnum.values()) {
			sortFilterMap.put(sortFilter, sortFilter.getName());
		}
		
		return sortFilterMap;
	}
	
	public static Map<SortFilterEnum, String> getSortingFields() {
		
		Map<SortFilterEnum, String> sortingFieldsMap = new HashMap<>();
		
		sortingFieldsMap.put(CREATED_AT, CREATED_AT.getName());
		sortingFieldsMap.put(L1_APPROVED_ON, L1_APPROVED_ON.getName());
		sortingFieldsMap.put(PROPERTY_NAMED_ON, PROPERTY_NAMED_ON.getName());
		
		return sortingFieldsMap;
	}
}
