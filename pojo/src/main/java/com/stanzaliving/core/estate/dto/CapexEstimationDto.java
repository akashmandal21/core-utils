package com.stanzaliving.core.estate.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CapexEstimationDto {

	private String category;
	
	private String item;
	
	private boolean stanzaProvided;
}
