/**
 * 
 */
package com.stanzaliving.core.food.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 15-Apr-2020
 *
 **/
@Getter
@AllArgsConstructor
public enum FoodRegion {

	MIX("Mix"),
	NORTH("North Indian"),
	SOUTH("South Indian"),
	CONTINENTAL("Continental");

	private String regionName;

	private static Map<String, FoodRegion> regionMapByName = new HashMap<>();

	private static List<EnumListing<FoodRegion>> enumListings = new ArrayList<>();
	private static List<EnumListing<FoodRegion>> multiMenuRegions = new ArrayList<>();

	static {

		for (FoodRegion foodRegion : FoodRegion.values()) {
			regionMapByName.put(foodRegion.getRegionName(), foodRegion);

			enumListings.add(EnumListing.of(foodRegion, foodRegion.getRegionName()));

			if (MIX != foodRegion) {
				multiMenuRegions.add(EnumListing.of(foodRegion, foodRegion.getLabel()));
			}
		}

	}

	public static FoodRegion getFoodRegionByName(String foodRegion) {
		return regionMapByName.get(foodRegion);
	}

	public static List<EnumListing<FoodRegion>> getListing() {
		return enumListings;
	}

	public static List<EnumListing<FoodRegion>> getMultiMenuRegions() {
		return multiMenuRegions;
	}

}