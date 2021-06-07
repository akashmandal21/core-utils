package com.stanzaliving.po.generic.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DeliveryAddress {
    private String addressUuid;
    private String locationName;
    private String addressText;
    private String stateUuid;
    private String cityUuid;

    public DeliveryAddress(String cityUuid){
        this.cityUuid=cityUuid;
    }
}
