package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 24-Sep-2020
 *
 * @version 1.0
 */


@Getter
@AllArgsConstructor
public enum VasType {
	VAS("VAS"),
	ADD_ON("Add-On");

	private String vasTypeName;

	private static final List<EnumListing<VasType>> enumListing = new ArrayList<>();

	static {
		for (VasType vasType : VasType.values()) {
			EnumListing<VasType> listing = EnumListing.of(vasType, vasType.getVasTypeName());

			enumListing.add(listing);
		}
	}

	public static List<EnumListing<VasType>> getEnumListing() {
		return enumListing;
	}

}
