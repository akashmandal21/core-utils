package com.stanzaliving.core.estate.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocationAnalysisDto {

	private Boolean lateNightPatrols;
	
	private Boolean adjoiningAreaSafety;
	
	private Boolean roadAccess;
	
	private Boolean monsoonPreparedness;
	
	private Boolean streetLighting;
	
	private Boolean foodDeliveryAvailable;
	
	private Boolean publicTransportAvailable;
	
	private Boolean rwaPresence;
	
	private String viewsOnRwa;
	
	private String comments;
	
	
	
}
