package com.stanzaliving.core.po.generic.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DeliveryAddressDto {

    private String addressUuid;

    private String locationName;

    private String addressText;

    private String stateUuid;

    private String cityUuid;

}
