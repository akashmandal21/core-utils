package com.stanzaliving.core.ventaaggregationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResidenceAndOccupancyPricingResponseDto {

    private String residenceName;
    private Integer gender;
    private boolean enabled;
    private List<Map<String,String>> occupancyPricing;
    private List<String> attributeName;
    private List<String> consumableName;
    private Integer residenceTypeId;
    private String propertyCode;
    private String residenceUuid;
}
