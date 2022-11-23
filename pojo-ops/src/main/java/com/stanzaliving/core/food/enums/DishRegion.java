package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.base.common.dto.ListingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

	MIX("Mix"),
	NORTH("North Indian"),
	SOUTH("South Indian"),
	CONTINENTAL("Continental");

	private String regionName;

	private static Map<String, DishRegion> dishRegionNameMap = new HashMap<>();

	private static List<ListingDto> dishRegionListing = new ArrayList<>();

	static {
		for (DishRegion dishRegion : DishRegion.values()) {
			dishRegionNameMap.put(dishRegion.getRegionName(), dishRegion);
			dishRegionListing.add(ListingDto.builder().id(dishRegion.name()).name(dishRegion.getRegionName()).build());
		}
	}

	public static Map<String, DishRegion> getDishRegionNameMap() {
		return dishRegionNameMap;
	}

	public static List<ListingDto> getDishRegionListing() {
		return dishRegionListing;
	}

	public static DishRegion getDishRegionByName(String regionName) {
		return dishRegionNameMap.get(regionName);
	}
}