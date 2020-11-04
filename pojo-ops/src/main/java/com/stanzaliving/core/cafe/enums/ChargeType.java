package com.stanzaliving.core.cafe.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChargeType {
	DELIVERY_CHARGES("Delivery Charges"),
	IN_ROOM_DELIVERY_CHARGES("In Room Delivery Charges");

	private String chargeTypeName;

	private static final List<EnumListing<ChargeType>> enumListing = new ArrayList<>();

	public static List<EnumListing<ChargeType>> getEnumListing() {
		return enumListing;
	}

	static {
		for (ChargeType chargeType : ChargeType.values()) {
			EnumListing<ChargeType> listing = EnumListing.of(chargeType, chargeType.getChargeTypeName());
			enumListing.add(listing);
		}
	}
}
