package com.stanzaliving.residenceservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OccupancyPricingAndRoomAttributesResponseDto implements Serializable {

    List<Map<String,String>> occupancyPricing;
    List<String> attributes;
    List<String> consumables;
    String residenceUuid;
}
