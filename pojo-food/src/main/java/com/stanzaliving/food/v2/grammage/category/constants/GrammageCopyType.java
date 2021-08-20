package com.stanzaliving.food.v2.grammage.category.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum GrammageCopyType {

	BASE_GRAMMAGE("Base Grammage"),
	GRAMMAGE_RULES("Grammage Rules"),
	THALI_GRAMMAGE("Thali Grammage");

	private String copyType;

	private static List<EnumListing<GrammageCopyType>> enumListings = new ArrayList<>();

	static {

		for (GrammageCopyType grammageCopyType : GrammageCopyType.values()) {
			enumListings.add(EnumListing.of(grammageCopyType, grammageCopyType.getCopyType()));
		}
	}


	public static List<EnumListing<GrammageCopyType>> getCopyTypeListing() {
		return enumListings;
	}
}
