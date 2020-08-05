package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UnitOfMeasurement {
	KILOGRAM("Kg"),
	LITRE("Ltr"),
	Number("Nos");

	private final String unitName;
}
