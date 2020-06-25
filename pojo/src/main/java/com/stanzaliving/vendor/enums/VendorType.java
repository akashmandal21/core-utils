package com.stanzaliving.vendor.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum VendorType {

	GC("GC"),
	ASIS("As-Is"),
	BOI("BOI"),
	COLLATERAL("Collateral"),
	BRANDING("Branding"),
	TRANSIT_MEDIA("Transit Media"),
	MERCHANDISE("Merchandise"),
	MANPOWER("Manpower"),
	MATERIAL_TRANSPORTATION("Material Transportation"),
	FACILITATION_CHARGES("Facilitation Charges"),
	OTHER("Others");

	private String type;

	private static final Map<String, VendorType> lookup = new HashMap<>();

	static {
		for (VendorType vendorType : VendorType.values())
			lookup.put(vendorType.getType(), vendorType);
	}

	public static VendorType get(String type) {
		return lookup.get(type);
	}
	
}