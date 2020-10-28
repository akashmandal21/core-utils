package com.stanzaliving.core.cafe.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SlotType {
	ALA_CARTE("Ala Carte"),
	BATCH_ORDERING("Batch Ordering");

	private String slotTypeName;

	private static final List<EnumListing<SlotType>> enumListing = new ArrayList<>();

	public static List<EnumListing<SlotType>> getEnumListing() {
		return enumListing;
	}

	static {
		for (SlotType slotType : SlotType.values()) {
			EnumListing<SlotType> listing = EnumListing.of(slotType, slotType.getSlotTypeName());
			enumListing.add(listing);
		}
	}
}
