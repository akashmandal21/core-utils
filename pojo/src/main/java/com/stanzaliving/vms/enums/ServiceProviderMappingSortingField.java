package com.stanzaliving.vms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ServiceProviderMappingSortingField {

	RESIDENCE_NAME("Residence Name"),
	SERVICES_PROVIDED("Services Provided"),
	SERVICE_PROVIDERS("Service Providers"),
	STATUS("Status"),
	LAST_UPDATED_BY("LastUpdatedBy");
	
    private final String field;
	
}
