package com.stanzaliving.core.phoenixAggregation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyDetailsDto {

    private String houseUuid;
    private String houseName;
    private String cityName;
    private String micromarketName;
}
