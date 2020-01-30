package com.stanzaliving.core.estate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstateAppDetailsDto {
    
	List<EstateStatusCountDto> propertyStatusCount;
    
    List<EstateDashboardListingDto> estateList;
    
    List<BDDashboardStatusCountDto> bdDashboardStatusCountDtos;
}
