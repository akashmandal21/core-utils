package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 22-Sep-2020
 *
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum PackagingMaterial {
	PLASTIC("Plastic"),
	PAPER("Paper");

	private String materialName;

	private static List<EnumListing<PackagingMaterial>> enumListings = new ArrayList<>();

	static {
		for (PackagingMaterial material: PackagingMaterial.values()) {
			EnumListing enumListing = EnumListing.of(material, material.getMaterialName());
			enumListings.add(enumListing);
		}
	}

	public static List<EnumListing<PackagingMaterial>> getEnumListing() {
		return enumListings;
	}
}
