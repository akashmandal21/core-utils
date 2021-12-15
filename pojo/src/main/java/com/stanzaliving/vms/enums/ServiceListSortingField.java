package com.stanzaliving.vms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ServiceListSortingField {

	SERVICE_NAME("Service Name"),
	STATUS("Status"),
	LAST_UPDATED_BY("LastUpdatedBy");
	
    private final String field;
	
}
