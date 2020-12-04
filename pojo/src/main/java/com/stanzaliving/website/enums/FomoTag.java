package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FomoTag {

	ALMOSTFULL("Almost Full", "Black"), 
	TOPSELLING("Top Selling", "Black"),
	FILLINGFAST("Filling Fast", "Black"),
	SOLDOUT("Sold Out", "Black");

	public String fomoTagName;
	public String fomoTagColour;
}
