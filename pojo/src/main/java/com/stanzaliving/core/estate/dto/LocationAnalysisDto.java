package com.stanzaliving.core.estate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
