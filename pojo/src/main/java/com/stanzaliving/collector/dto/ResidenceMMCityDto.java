package com.stanzaliving.collector.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceMMCityDto {
    String bookingUuid;
    String residenceUuid;
    String micromarketUuid;
    String cityUuid;
}
