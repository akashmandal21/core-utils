package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author piyush.srivastava
 *
 * @version 1.0
 *
 * @since 25-Aug-2020
 */

@Getter
@AllArgsConstructor
public enum DishRegion {
	INDIAN("Mix"),
	NORTH("North Indian"),
	SOUTH("South Indian"),
	CONTINENTAL("Continental");

	private String regionName;


	private static Map<String, DishRegion> dishRegionNameMap = new HashMap<>();

	static {
		for(DishRegion dishRegion: DishRegion.values()) {
			dishRegionNameMap.put(dishRegion.getRegionName(), dishRegion);
		}
	}

	public static Map<String, DishRegion> getDishRegionNameMap() {
		return dishRegionNameMap;
	}
}
