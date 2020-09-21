package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityResponseDTO {
    private int cityId;

    private String name;

    private String code;

    private int stateId;

    private String stateName;

    private boolean brokerAppVisible;

    private double latitude;

    private double longitude;

}
