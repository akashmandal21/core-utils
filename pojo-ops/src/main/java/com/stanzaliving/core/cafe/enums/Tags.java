package com.stanzaliving.core.cafe.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Tags {

	CANTEEN("Canteen"),
	TUCK_SHOP("Tuck Shop");

	private String tagName;

	private static final List<EnumListing<Tags>> enumListing = new ArrayList<>();

	public static List<EnumListing<Tags>> getEnumListing() {
		return enumListing;
	}

	static {
		for (Tags tag : Tags.values()) {
			EnumListing<Tags> listing = EnumListing.of(tag, tag.getTagName());
			enumListing.add(listing);
		}
	}

}