package com.stanzaliving.transformations.enums;

import java.util.*;

import com.stanzaliving.core.vendor.enums.VendorType;

import lombok.Getter;

@Getter
public enum LocationType {

	HOUSE("House", VendorType.IN_HOUSE),
	WAREHOUSE("Warehouse", VendorType.IN_WAREHOUSE),
	CITY_OFFICE("City Office", VendorType.IN_CITY_OFFICE),
	CORPORATE_OFFICE("Corporate Office", VendorType.IN_CORPORATE_OFFICE),
	KITCHEN("Kitchen", VendorType.IN_KITCHEN),
	STORE("Store", VendorType.IN_STORE),
	CAFE("Cafe", VendorType.IN_CAFE),

	CITY("City",null),
	MICROMARKET("Micromarket",null),
	NATIONAL("National",null);

	private String locationTypeName;
	private VendorType vendorType;
	
	private LocationType(String locationTypeName, VendorType vendorType) {
		this.locationTypeName = locationTypeName;
		this.vendorType = vendorType;
	}
	
	private static Map<String, LocationType> locationByVendorMap = new HashMap<>(); 
	private static List<LocationType> locationAddressable = new ArrayList<>();
	static {

		for (LocationType locType : LocationType.values()) {
			if(Objects.nonNull(locType.getVendorType()))
				locationByVendorMap.put(locType.getVendorType().name(), locType);
		}

		locationAddressable.addAll(Arrays.asList(HOUSE,WAREHOUSE,CITY_OFFICE,CAFE,KITCHEN,STORE,CORPORATE_OFFICE));
	}
	
	public static LocationType getLocationByVendorName(String name) {
		return locationByVendorMap.get(name);
	}

	public static List<LocationType> getLocationAddressable(){
		return locationAddressable;
	}
}
