package com.stanzaliving.core.discount.dto.response;

import com.stanzaliving.booking.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscountStrategyListingResponseDto {
	
	private String uuid;
	
    private String strategyName;

    private String strategy;
    
    private String applicationDate;
    
    private Boolean status;
    
    private Set<String> city;
    
    private Set<String> micromarket;
    
    private Set<String> residence;
    
    private ApplicabilityLevelType applicabilityLevelType;
    
    private String cityUuid;
    
    private String micromarketUuid;
    
    private String residenceUuid;
    
    private Strategy actualStrategy;
    
    private Integer startMonth;
    
    private Integer endMonth;
    
    private String ventaDisplayName;
    
    private DiscountApplicabilityType applicabilityType;
    
    private Integer maxDiscountPercentage;
    
    private Map<String,String> monthWiseDiscountPercentage;
    
    private Integer cutOffDate;
    
    private PropertyType propertyType;

    private BookingSubType bookingSubType;

}
