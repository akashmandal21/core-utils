package com.stanzaliving.core.estate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstateAppDetailsDto {
    List<StatusCountDto> propertyStatusCount;
    List<EstateDashboardListingDto> estateList;
    
}
