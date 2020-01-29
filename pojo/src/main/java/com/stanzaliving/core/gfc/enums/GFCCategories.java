package com.stanzaliving.core.gfc.enums;

import java.util.EnumMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Category enums for GFC Drawings.
 * 
 * @author debendra.dhinda
 * @since 27-Jan-2020
 */

@Getter
@AllArgsConstructor
public enum GFCCategories {

	GFC_CATEGORY_TYPICAL_FLOOR("Typical Floor",1),
	GFC_CATEGORY_RECEPTION("Reception",2),
	GFC_CATEGORY_COMMON_AREA("Common Area",3),
	GFC_CATEGORY_OTHER("Other",4);

	private String categoryName;
	private int order;

	private static EnumMap<GFCCategories, String> gfcCategoriesMap = new EnumMap<>(GFCCategories.class);

	static {
		gfcCategoriesMap.put(GFC_CATEGORY_TYPICAL_FLOOR, GFCCategories.GFC_CATEGORY_TYPICAL_FLOOR.getCategoryName());
		gfcCategoriesMap.put(GFC_CATEGORY_RECEPTION, GFCCategories.GFC_CATEGORY_RECEPTION.getCategoryName());
		gfcCategoriesMap.put(GFC_CATEGORY_COMMON_AREA, GFCCategories.GFC_CATEGORY_COMMON_AREA.getCategoryName());
		gfcCategoriesMap.put(GFC_CATEGORY_OTHER, GFCCategories.GFC_CATEGORY_OTHER.getCategoryName());
	}

	public static Map<GFCCategories, String> getAll() {
		return gfcCategoriesMap;
	}
}
