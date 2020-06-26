package com.stanzaliving.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum PoType {

	BOI("BOI"),
	GC("GC"),
	ASIS("As-Is"),
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
