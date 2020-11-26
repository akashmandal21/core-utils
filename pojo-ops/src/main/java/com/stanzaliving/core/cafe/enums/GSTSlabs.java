package com.stanzaliving.core.cafe.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GSTSlabs {

	ZERO("0"),
    FIVE("5"),
    TWELVE("12"),
    EIGHTEEN("18"),
    TWENTY_EIGHT("28");

    private String gstPct;
    
    private static final List<EnumListing<GSTSlabs>> enumListing = new ArrayList<>();

	public static List<EnumListing<GSTSlabs>> getEnumListing() {
		return enumListing;
	}

	static {
		for (GSTSlabs gstSlabs : GSTSlabs.values()) {
			EnumListing<GSTSlabs> listing = EnumListing.of(gstSlabs, gstSlabs.getGstPct());
			enumListing.add(listing);
		}
	}

}
