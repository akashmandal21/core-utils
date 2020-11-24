package com.stanzaliving.core.cafe.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GSTSlabs {

    NA("Not Applicable",null),
    ZERO("0 %",0.0),
    FIVE("05 %",5.0),
    TWELEVE("12 %",12.0),
    EIGHTEEN("18 %",18.0),
    TWENTY_EIGHT("28 %",28.0);
    private String fieldTypeText;
    private Double gstPct;
    
    private static final List<EnumListing<GSTSlabs>> enumListing = new ArrayList<>();

	public static List<EnumListing<GSTSlabs>> getEnumListing() {
		return enumListing;
	}

	static {
		for (GSTSlabs chargeType : GSTSlabs.values()) {
			EnumListing<GSTSlabs> listing = EnumListing.of(chargeType, String.valueOf(chargeType.getGstPct()));
			enumListing.add(listing);
		}
	}

}
