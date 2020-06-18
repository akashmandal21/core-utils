package com.stanzaliving.core.food.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 12-June-2020
 */

@Getter
@AllArgsConstructor
public enum MenuType {

	PURE_VEG("Pure Veg"),
	VEG_AND_NON_VEG("Veg and Non-Veg");

	private String menuTypeName;

	private static List<EnumListing<MenuType>> enumListings = new ArrayList<>();

	static {

		for (MenuType menuType : MenuType.values()) {
			enumListings.add(EnumListing.of(menuType, menuType.getMenuTypeName()));
		}

	}

	public static List<EnumListing<MenuType>> getMenuTypeListing() {
		return enumListings;
	}
}