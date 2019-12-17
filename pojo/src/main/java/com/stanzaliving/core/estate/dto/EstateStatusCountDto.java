package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.estate.enums.EstateStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstateStatusCountDto {
	
	private EstateStatus estateStatus;
	
	private String name;
    
	private Long count;
    
    public EstateStatusCountDto(EstateStatus estateStatus,long count) {
    	
    	this.estateStatus = estateStatus ;
    	this.count = count;
    }
}
