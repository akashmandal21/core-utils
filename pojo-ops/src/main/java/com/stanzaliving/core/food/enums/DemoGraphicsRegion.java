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
	ANDHRA(1, "Andhra", 1),
	EAST_INDIAN(2, "East Indian", 2),
	GUJRATI(3, "Gujrati", 3),
	HYDERABADI(4, "Hyderabadi", 4),
	KARNATAKA(5, "Karnataka", 5),
	KERALA(6, "Kerala", 6),
	MAHARASHTIA(7, "Maharashtian", 7),
	MIX(8, "Mix", 8),
	NORTH_INDIAN(9, "North Indian", 9),
	ORIENTAL(10, "Oriental", 10),
	PUNJABI(11, "Punjabi", 11),
	RAJASTHANI(12, "Rajasthani", 12),
	SOUTH_INDIAN(13, "South Indian", 13),
	TAMIL_NADU(14, "Tamil Nadu", 14),
	WEST_INDIAN(15, "West Indian", 15);

	private Integer foodRegionId;
	private String foodRegionName;
	private Integer sequence;


	private static Map<Integer, DemoGraphicsRegion> foodRegionMapById = new HashMap<>();
	private static Map<String, DemoGraphicsRegion> foodRegionMapByName = new HashMap<>();
	private static List<String> foodRegionIds = new ArrayList<>();

	private static Map<DemoGraphicsRegion, String> foodRegionMapByType = new LinkedHashMap<>();
	private static Map<String, String> foodRegionMapByTypeStr = new LinkedHashMap<>();

	private static List<EnumListing<DemoGraphicsRegion>> enumListings = new ArrayList<>();

	static {

		for (DemoGraphicsRegion demoGraphicsRegion : DemoGraphicsRegion.values()) {
			foodRegionMapById.put(demoGraphicsRegion.getFoodRegionId(), demoGraphicsRegion);
			foodRegionMapByName.put(demoGraphicsRegion.getFoodRegionName(), demoGraphicsRegion);
			foodRegionIds.add(demoGraphicsRegion.getFoodRegionId().toString());
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

	public static Integer getFoodRegionId(String foodRegionName) {

		if (foodRegionMapByName.containsKey(foodRegionName)) {
			return foodRegionMapByName.get(foodRegionName).getFoodRegionId();
		}

		return -1;

	}

	public static Map<DemoGraphicsRegion, String> getFoodRegionMapByType() {
		return foodRegionMapByType;
	}

	public static Map<String, String> getFoodRegionMapByTypeStr() {
		return foodRegionMapByTypeStr;
	}

	public static String getFoodRegionName(String foodRegionId) {

		if (foodRegionMapById.containsKey(StanzaParseUtils.getIntValue(foodRegionId))) {
			return foodRegionMapById.get(StanzaParseUtils.getIntValue(foodRegionId)).getFoodRegionName();
		}

		return null;
	}

	public static DemoGraphicsRegion getFoodRegion(Integer foodRegionId) {
		return foodRegionMapById.get(foodRegionId);
	}

	public static List<String> getFoodRegionIds() {
		return foodRegionIds;
	}

	public static DemoGraphicsRegion getFoodRegionByName(String foodRegionName) {
		return foodRegionMapByName.get(foodRegionName);
	}

	public static List<EnumListing<DemoGraphicsRegion>> getFoodRegionListing() {
		return enumListings;
	}
}
