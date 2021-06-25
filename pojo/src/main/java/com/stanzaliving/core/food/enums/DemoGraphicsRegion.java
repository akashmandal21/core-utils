package com.stanzaliving.core.food.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DemoGraphicsRegion {
	ANDHRA("Andhra", 1),
	EAST_INDIAN("East Indian", 2),
	GUJRATI("Gujrati", 3),
	HYDERABADI("Hyderabadi", 4),
	KARNATAKA("Karnataka", 5),
	KERALA("Kerala", 6),
	MAHARASHTIA("Maharashtian", 7),
	MIX("Mix", 8),
	NORTH_INDIAN("North Indian", 9),
	ORIENTAL("Oriental", 10),
	PUNJABI("Punjabi", 11),
	RAJASTHANI("Rajasthani", 12),
	SOUTH_INDIAN("South Indian", 13),
	TAMIL_NADU("Tamil Nadu", 14),
	WEST_INDIAN("West Indian", 15);

	private String foodRegionName;
	private Integer sequence;


	private static Map<String, DemoGraphicsRegion> foodRegionMapByName = new HashMap<>();

	private static Map<DemoGraphicsRegion, String> foodRegionMapByType = new LinkedHashMap<>();
	private static Map<String, String> foodRegionMapByTypeStr = new LinkedHashMap<>();

	private static List<EnumListing<DemoGraphicsRegion>> enumListings = new ArrayList<>();

	static {

		for (DemoGraphicsRegion demoGraphicsRegion : DemoGraphicsRegion.values()) {
			foodRegionMapByName.put(demoGraphicsRegion.getFoodRegionName(), demoGraphicsRegion);
			enumListings.add(EnumListing.of(demoGraphicsRegion, demoGraphicsRegion.getFoodRegionName()));
		}
		for (DemoGraphicsRegion demoGraphicsRegion : DemoGraphicsRegion.values()) {
			foodRegionMapByType.put(demoGraphicsRegion, demoGraphicsRegion.getFoodRegionName());	
		}
		
		for (DemoGraphicsRegion demoGraphicsRegion : DemoGraphicsRegion.values()) {
			foodRegionMapByTypeStr.put(demoGraphicsRegion.toString(), demoGraphicsRegion.getFoodRegionName());	
		}
	}	

	public static Map<DemoGraphicsRegion, String> getFoodRegionMapByType() {
		return foodRegionMapByType;
	}

	public static Map<String, String> getFoodRegionMapByTypeStr() {
		return foodRegionMapByTypeStr;
	}

	public static DemoGraphicsRegion getFoodRegionByName(String foodRegionName) {
		return foodRegionMapByName.get(foodRegionName);
	}

	public static List<EnumListing<DemoGraphicsRegion>> getFoodRegionListing() {
		return enumListings;
	}
}
