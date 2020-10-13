package com.stanzaliving.transformations.enums;

import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.core.vendor.enums.VendorType;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum LocationType {

	HOUSE("House", VendorType.IN_HOUSE),
	WAREHOUSE("Warehouse", VendorType.IN_WAREHOUSE),
	CITY_OFFICE("City Office", VendorType.IN_CITY_OFFICE),
	CORPORATE_OFFICE("Corporate Office", VendorType.IN_CORPORATE_OFFICE),
	KITCHEN("Kitchen", VendorType.IN_KITCHEN),
	STORE("Store", VendorType.IN_STORE),
	CAFE("Cafe", VendorType.IN_CAFE);
	
	private String name;
	private VendorType vendorType;
	
	private LocationType(String name, VendorType vendorType) {
		this.name = name;
		this.vendorType = vendorType;
	}
	
	private static Map<String, LocationType> locationByVendorMap = new HashMap<>(); 
	static {

		for (LocationType locType : LocationType.values()) {
			locationByVendorMap.put(locType.getVendorType().name(), locType);
		}
	}
	
	public static LocationType getLocationByVendorName(String name) {
		return locationByVendorMap.get(name);
	}
}
