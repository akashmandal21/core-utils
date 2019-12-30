package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.estate.enums.BDDashboardStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BDDashboardStatusCountDto {
	
	private BDDashboardStatus status;
	
	private String name;
    
	private Long count;
    
	private Double percentage;
	
	private String color;
    
    public BDDashboardStatusCountDto(BDDashboardStatus status,long count) {
    	
    	this.status = status ;
    	this.count = count;
    }
}
