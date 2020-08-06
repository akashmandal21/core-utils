package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.base.common.dto.ListingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum CommercialTag {
	HIGH ("High"),
	MEDIUM ("Medium"),
	LOW ("Low");

	private final String tagName;

	private static List<ListingDto> commercialTagListing = new ArrayList<>();

	static {

		for (CommercialTag commercialTag : CommercialTag.values()) {
			commercialTagListing.add(ListingDto.builder().id(commercialTag.name()).name(commercialTag.getTagName()).build());
		}
	}

	public static List<ListingDto> getCommercialTagListing() {
		return commercialTagListing;
	}
}
