package com.stanzaliving.core.estate.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocationAnalysisDto {

	private String lateNightPatrols;
	
	private String adjoiningAreaSafety;
	
	private String roadAccess;
	
	private String monsoonPreparedness;
	
	private String streetLighting;
	
	private String foodDeliveryAvailable;
	
	private String publicTransportAvailable;
	
	private String rwaPresence;
	
	private String viewsOnRwa;
	
	private String comments;
	
	
	
}
