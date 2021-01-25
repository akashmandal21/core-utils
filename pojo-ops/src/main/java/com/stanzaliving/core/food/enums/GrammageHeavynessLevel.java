package com.stanzaliving.core.food.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GrammageHeavynessLevel {

	SUPER_LIGHT("Super Light"),
	LIGHT("Light"),
	NORMAL("Normal"),
	HEAVY("Heavy"),
	SUPER_HEAVY("Super Heavy");

	private String displayName;

	private static List<EnumListing<GrammageHeavynessLevel>> enumListings = new ArrayList<>();

	static {

		for (GrammageHeavynessLevel heavynessLevel : GrammageHeavynessLevel.values()) {
			enumListings.add(EnumListing.of(heavynessLevel, heavynessLevel.getDisplayName()));
		}

	}

	public static List<EnumListing<GrammageHeavynessLevel>> getListing() {
		return enumListings;
	}

}