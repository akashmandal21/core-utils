package com.stanzaliving.food.v2.common.constant;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ThaliType {
	NORMAL("Normal"),
	COMBO("Combo");

	private static List<EnumListing<ThaliType>> thaliTypeListing = new ArrayList<>();

	private final String type;

	static {

		for (ThaliType thaliType: ThaliType.values()) {
			thaliTypeListing.add(EnumListing.of(thaliType, thaliType.getType()));
		}

	}

	public static List<EnumListing<ThaliType>> getThaliTypeListing() {
		return thaliTypeListing;
	}
}
