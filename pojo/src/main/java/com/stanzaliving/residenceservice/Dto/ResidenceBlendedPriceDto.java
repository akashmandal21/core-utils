package com.stanzaliving.residenceservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceBlendedPriceDto {

    private String residenceUuid;
    private Double blendedPrice;
    
    private List<OccupancyBlendedPriceDto> blendedPriceByOccupancy;
}
