package com.stanzaliving.transformations.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

import com.stanzaliving.core.vendor.enums.VendorType;

import lombok.Getter;

@Getter
public enum LocationType {

	HOUSE("House", VendorType.IN_HOUSE),
	HOUSE_WAREHOUSE("House Warehouse", VendorType.IN_HOUSE_WAREHOUSE),
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
	private static SortedMap<String, LocationType> locationTypeMap = new TreeMap<String, LocationType>();
	private static List<LocationType> locationAddressable = new ArrayList<>();
	private static List<LocationType> applicableLocationTypesForHoto = new ArrayList<>();
	private static EnumSet<LocationType> locationAddressableSet = null;
	
	static {

		for (LocationType locType : LocationType.values()) {
			locationTypeMap.put(locType.getLocationTypeName(), locType);
			if(Objects.nonNull(locType.getVendorType()))
				locationByVendorMap.put(locType.getVendorType().name(), locType);
		}

		locationAddressable.addAll(Arrays.asList(HOUSE,WAREHOUSE,HOUSE_WAREHOUSE,CITY_OFFICE,CAFE,KITCHEN,STORE,CORPORATE_OFFICE));
		locationAddressableSet = EnumSet.copyOf(locationAddressable);
		applicableLocationTypesForHoto.addAll(Arrays.asList(HOUSE, CITY_OFFICE, CAFE, KITCHEN, STORE, CORPORATE_OFFICE));
		Collections.sort(applicableLocationTypesForHoto, new Comparator<LocationType>() {

			@Override
			public int compare(LocationType lt1, LocationType lt2) {
				return lt1.getLocationTypeName().compareToIgnoreCase(lt2.getLocationTypeName());
			}
		});
	}
	
	public static LocationType getLocationByVendorName(String name) {
		return locationByVendorMap.get(name);
	}

	public static List<LocationType> getLocationAddressable(){
		return locationAddressable;
	}
	
	public static EnumSet<LocationType> getLocationAddressableSet(){
		return locationAddressableSet;
	}
	
	public static Collection<LocationType> getLocationTypes() {
		return locationTypeMap.values();
	}

	public static Collection<LocationType> getApplicableLocationTypesForHoto() {
		return applicableLocationTypesForHoto;
	}

}
