package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ApartmentRoomType {

	SINGLE_BED("Single Bed"), SINGLE_ROOM("Single Room"), ENTIRE_FLAT("Entire Flat");

	private String displayName;
}
