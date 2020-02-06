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
public enum GFCCategoryEnum {

	GFC_CATEGORY_TYPICAL_FLOOR("Typical Floor",1),
	GFC_CATEGORY_RECEPTION("Reception",2),
	GFC_CATEGORY_COMMON_AREA("Common Area",3),
	GFC_CATEGORY_OTHER("Other",4);

	private String categoryName;
	private int order;

	private static EnumMap<GFCCategoryEnum, String> gfcCategoriesMap = new EnumMap<>(GFCCategoryEnum.class);

	static {
		gfcCategoriesMap.put(GFC_CATEGORY_TYPICAL_FLOOR, GFCCategoryEnum.GFC_CATEGORY_TYPICAL_FLOOR.getCategoryName());
		gfcCategoriesMap.put(GFC_CATEGORY_RECEPTION, GFCCategoryEnum.GFC_CATEGORY_RECEPTION.getCategoryName());
		gfcCategoriesMap.put(GFC_CATEGORY_COMMON_AREA, GFCCategoryEnum.GFC_CATEGORY_COMMON_AREA.getCategoryName());
		gfcCategoriesMap.put(GFC_CATEGORY_OTHER, GFCCategoryEnum.GFC_CATEGORY_OTHER.getCategoryName());
	}

	public static Map<GFCCategoryEnum, String> getAll() {
		return gfcCategoriesMap;
	}
}
