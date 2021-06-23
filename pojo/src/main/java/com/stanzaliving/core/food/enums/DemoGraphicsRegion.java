package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.base.utils.StanzaParseUtils;
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
		foodRegionMapByType.put(ANDHRA, ANDHRA.getFoodRegionName());
		foodRegionMapByType.put(EAST_INDIAN, EAST_INDIAN.getFoodRegionName());
		foodRegionMapByType.put(GUJRATI, GUJRATI.getFoodRegionName());
		foodRegionMapByType.put(HYDERABADI, HYDERABADI.getFoodRegionName());
		foodRegionMapByType.put(KARNATAKA, KARNATAKA.getFoodRegionName());
		foodRegionMapByType.put(KERALA, KERALA.getFoodRegionName());
		foodRegionMapByType.put(MAHARASHTIA, MAHARASHTIA.getFoodRegionName());
		foodRegionMapByType.put(MIX, MIX.getFoodRegionName());
		foodRegionMapByType.put(NORTH_INDIAN, NORTH_INDIAN.getFoodRegionName());
		foodRegionMapByType.put(ORIENTAL, ORIENTAL.getFoodRegionName());
		foodRegionMapByType.put(PUNJABI, PUNJABI.getFoodRegionName());
		foodRegionMapByType.put(RAJASTHANI, RAJASTHANI.getFoodRegionName());
		foodRegionMapByType.put(SOUTH_INDIAN, SOUTH_INDIAN.getFoodRegionName());
		foodRegionMapByType.put(TAMIL_NADU, TAMIL_NADU.getFoodRegionName());
		foodRegionMapByType.put(WEST_INDIAN, WEST_INDIAN.getFoodRegionName());


		foodRegionMapByTypeStr.put(ANDHRA.toString(), ANDHRA.getFoodRegionName());
		foodRegionMapByTypeStr.put(EAST_INDIAN.toString(), EAST_INDIAN.getFoodRegionName());
		foodRegionMapByTypeStr.put(GUJRATI.toString(), GUJRATI.getFoodRegionName());
		foodRegionMapByTypeStr.put(HYDERABADI.toString(), HYDERABADI.getFoodRegionName());
		foodRegionMapByTypeStr.put(KARNATAKA.toString(), KARNATAKA.getFoodRegionName());
		foodRegionMapByTypeStr.put(KERALA.toString(), KERALA.getFoodRegionName());
		foodRegionMapByTypeStr.put(MAHARASHTIA.toString(), MAHARASHTIA.getFoodRegionName());
		foodRegionMapByTypeStr.put(MIX.toString(), MIX.getFoodRegionName());
		foodRegionMapByTypeStr.put(NORTH_INDIAN.toString(), NORTH_INDIAN.getFoodRegionName());
		foodRegionMapByTypeStr.put(ORIENTAL.toString(), ORIENTAL.getFoodRegionName());
		foodRegionMapByTypeStr.put(PUNJABI.toString(), PUNJABI.getFoodRegionName());
		foodRegionMapByTypeStr.put(RAJASTHANI.toString(), RAJASTHANI.getFoodRegionName());
		foodRegionMapByTypeStr.put(SOUTH_INDIAN.toString(), SOUTH_INDIAN.getFoodRegionName());
		foodRegionMapByTypeStr.put(TAMIL_NADU.toString(), TAMIL_NADU.getFoodRegionName());
		foodRegionMapByTypeStr.put(WEST_INDIAN.toString(), WEST_INDIAN.getFoodRegionName());

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
