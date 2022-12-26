package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum DemoGraphicsRegion {

	
	BENGALI("Bengali", 1),
	BIHARI("Bihari", 2),
	EAST_INDIAN("East Indian", 3),
	GOAN("Goan", 4),
	GUJRATI("Gujrati", 5),
	KANNADA("Kannada", 6),
	MAHARASHTIAN("Maharashtian", 7),
	MALYALI("Malyali", 8),
	NORTH_INDIAN("North Indian", 9),
	PUNJABI("Punjabi", 10),
	RAJASTHANI("Rajasthani", 11),	
	TAMIL("Tamil", 12),
	TELEGU("Telegu", 13),
	WAZWAN("Wazwan", 14),
	WESTERN("Western", 15),
	SOUTH_INDIAN("South Indian", 16);

	private String foodRegionName;
	private Integer sequence;


	private static Map<String, DemoGraphicsRegion> foodRegionMapByName = new HashMap<>();

	private static Map<DemoGraphicsRegion, String> foodRegionMapByType = new LinkedHashMap<>();
	private static Map<String, String> foodRegionMapByTypeStr = new LinkedHashMap<>();

	private static List<EnumListing<DemoGraphicsRegion>> enumListings = new ArrayList<>();

	static {

		for (DemoGraphicsRegion demoGraphicsRegion : DemoGraphicsRegion.values()) {
			foodRegionMapByName.put(demoGraphicsRegion.name(), demoGraphicsRegion);
			enumListings.add(EnumListing.of(demoGraphicsRegion, demoGraphicsRegion.getFoodRegionName()));
			foodRegionMapByType.put(demoGraphicsRegion, demoGraphicsRegion.getFoodRegionName());
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
