package com.stanzaliving.core.leadership.dto;

import com.stanzaliving.core.leadership.enums.PricingStepStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PricingStepStatusCountDto {
	
	private PricingStepStatus status;
	
	private String name;
    
	private Long count;
    
	private Double percentage;
	
	private String color;
    
}
