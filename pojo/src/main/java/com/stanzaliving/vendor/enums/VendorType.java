package com.stanzaliving.vendor.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
	
}