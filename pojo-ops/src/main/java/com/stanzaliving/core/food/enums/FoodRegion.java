/**
 * 
 */
package com.stanzaliving.core.food.enums;

import java.util.HashMap;
import java.util.Map;

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
	SOUTH("South Indian");

	private String regionName;

	private static Map<String, FoodRegion> regionMapByName = new HashMap<>();

	static {

		for (FoodRegion foodRegion : FoodRegion.values()) {
			regionMapByName.put(foodRegion.getRegionName(), foodRegion);
		}

	}

	public static FoodRegion getFoodRegionByName(String foodRegion) {
		return regionMapByName.get(foodRegion);
	}
}