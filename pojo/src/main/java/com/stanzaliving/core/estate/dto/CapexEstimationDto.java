package com.stanzaliving.core.estate.dto;

import lombok.Data;

@Data
public class CapexEstimationDto {

	private String category;
	
	private String item;
	
	private boolean stanzaProvided;
}
