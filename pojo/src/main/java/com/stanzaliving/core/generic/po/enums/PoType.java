package com.stanzaliving.core.generic.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum PoType {

	NON_RENTAL("Non Rental Items/Service PO"),
	RENTAL("Rental Items/Material Buy");
	
	private String type;
}
