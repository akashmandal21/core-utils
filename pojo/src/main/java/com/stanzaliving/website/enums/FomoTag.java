package com.stanzaliving.website.enums;

import org.apache.commons.lang3.StringUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FomoTag {

	ALMOSTFULL("Almost Full", "#283264"),
	TOPSELLING("Top Selling", "#645A87"),
	FILLINGFAST("Filling Fast", "#FAB432"),
	SOLDOUT("Sold Out", "#F05A78"),
	NONE("None","#7D7A7A"),
	ONLYFIFTEENLEFT("Only 15 beds left","#FFF1F1");

	public String fomoTagName;
	public String fomoTagColour;

	public static FomoTag fromString(String fomoTagName) {

		if (StringUtils.isBlank(fomoTagName))
			return null;

		for (FomoTag fomoTag : FomoTag.values()) {
			if (fomoTag.getFomoTagName().equalsIgnoreCase(fomoTagName)) {
				return fomoTag;
			}
		}
		return null;
	}
}
