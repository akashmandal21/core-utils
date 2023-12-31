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
public enum FoodItemTextColor {

	BLACK("Black", "#000000");

	private String colorName;

	private String colorCode;

	private static List<ListingDto> colorList = new ArrayList<>();

	private static Map<String, FoodItemTextColor> colorByNameMap = new HashMap<>();
	private static Map<String, FoodItemTextColor> colorByCodeMap = new HashMap<>();

	static {

		for (FoodItemTextColor itemTextColor : FoodItemTextColor.values()) {
			colorByNameMap.put(itemTextColor.getColorName(), itemTextColor);
			colorByCodeMap.put(itemTextColor.getColorCode(), itemTextColor);
			colorList.add(ListingDto.builder().id(itemTextColor.getColorName()).name(itemTextColor.getColorCode()).build());
		}
	}

	public static FoodItemTextColor getColorByName(String colorName) {
		return colorByNameMap.get(colorName);
	}
	
	public static FoodItemTextColor getColorByCode(String colorCode) {
		return colorByCodeMap.get(colorCode);
	}

	public static List<ListingDto> getItemTextColors() {
		return colorList;
	}
}