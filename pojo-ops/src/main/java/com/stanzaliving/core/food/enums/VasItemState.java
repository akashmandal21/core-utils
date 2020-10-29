package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 22-Sep-2020
 *
 * @version 1.0
 */

@Getter
@AllArgsConstructor
public enum VasItemState {
	SOLID("Solid"),
	LIQUID("Liquid"),
	SEMI_SOLID("Semi Solid");

	private String stateName;

	private static final List<EnumListing<VasItemState>> enumListing = new ArrayList<>();

	static {
		for (VasItemState itemState: VasItemState.values()) {
			EnumListing<VasItemState> listing = new EnumListing<>(itemState, itemState.getStateName());

			enumListing.add(listing);
		}
	}

	public static List<EnumListing<VasItemState>> getEnumListing() {
		return enumListing;
	}
}
