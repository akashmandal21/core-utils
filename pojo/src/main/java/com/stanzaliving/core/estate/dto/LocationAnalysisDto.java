package com.stanzaliving.core.estate.dto;

import lombok.Data;

@Data
public class LocationAnalysisDto {

	private boolean lateNightPatrols;
	
	private boolean adjoiningAreaSafety;
	
	private boolean roadAccess;
	
	private boolean monsoonPreparedness;
	
	private boolean streetLighting;
	
	private boolean foodDeliveryAvailable;
	
	private boolean publicTransportAvailable;
	
	private boolean rwaPresence;
	
	private String viewsOnRwa;
	
	private String comments;
	
}
