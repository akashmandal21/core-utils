package com.stanzaliving.core.residenceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlendedPriceWithOccupancyDataDto {
    private Double blendedPrice;
    private Double occupancy;
    private Double bedCount;

    private Double averageOccupancyPrice;


}
