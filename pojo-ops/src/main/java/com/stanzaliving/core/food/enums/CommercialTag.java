package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.base.common.dto.ListingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum CommercialTag {
	PREMIUM("Premium"),
	MEDIUM ("Medium"),
	ECONOMY("Economy");

	private final String tagName;

	private static List<ListingDto> commercialTagListing = new ArrayList<>();

	private static HashMap<String, CommercialTag> commercialTagNameMap = new HashMap<>();

	static {

		for (CommercialTag commercialTag : CommercialTag.values()) {
			commercialTagListing.add(ListingDto.builder().id(commercialTag.name()).name(commercialTag.getTagName()).build());
			commercialTagNameMap.putIfAbsent(commercialTag.getTagName(), commercialTag);
		}
	}

	public static List<ListingDto> getCommercialTagListing() {
		return commercialTagListing;
	}

	public static Map<String, CommercialTag> getCommercialTagNameMap() {
		return commercialTagNameMap;
	}

	public static CommercialTag getCommercialTagByName(String tagName) {
		return commercialTagNameMap.get(tagName);
	}
}
