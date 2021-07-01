package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PropertyEntityType {
	
	HOUSE("House"), WAREHOUSE("Warehouse"), KITCHEN("Kitchen"), MANAGED_APARTMENTS("Managed Apartments");

	private String propertyEntityName;
}
