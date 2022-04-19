package com.stanzaliving.core.residenceservice.dto;

import com.stanzaliving.residenceservice.Dto.OccupancyBlendedPriceDto;
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
