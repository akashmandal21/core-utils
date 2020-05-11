/**
 * 
 */
package com.stanzaliving.core.food.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.base.common.dto.ListingDto;

import lombok.AllArgsConstructor;

import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 11-May-2020
 *
 **/
@Getter
@AllArgsConstructor
public enum FoodItemBackgroundColor {

	WHITE("White", "#E0E0E0"),
	YELLOW("Yellow", "#FFFF00"),
	BROWN("Brown", "#A5673F"),
	RED("Red", "#F76464"),
	GREEN("Green", "#76D46F"),
	ORANGE("Orange", "#FF9A00");

	private String colorName;

	private String colorCode;

	private static List<ListingDto> colorList = new ArrayList<>();

	private static Map<String, FoodItemBackgroundColor> colorByNameMap = new HashMap<>();

	static {

		for (FoodItemBackgroundColor itemBackgroundColor : FoodItemBackgroundColor.values()) {
			colorByNameMap.put(itemBackgroundColor.getColorName(), itemBackgroundColor);
			colorList.add(ListingDto.builder().id(itemBackgroundColor.getColorName()).name(itemBackgroundColor.getColorCode()).build());
		}
	}

	public static FoodItemBackgroundColor getColorByName(String colorName) {
		return colorByNameMap.get(colorName);
	}

	public static List<ListingDto> getItemBackgroundColors() {
		return colorList;
	}
}