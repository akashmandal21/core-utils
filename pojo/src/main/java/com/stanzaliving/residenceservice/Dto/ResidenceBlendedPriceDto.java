package com.stanzaliving.residenceservice.Dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceBlendedPriceDto {

    private String residenceUuid;
    private Double blendedPrice;
    
    private List<OccupancyBlendedPriceDto> blendedPriceByOccupancy;
}
