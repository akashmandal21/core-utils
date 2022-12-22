package com.stanzaliving.estate_v2.dto;

import com.stanzaliving.core.user.dto.Address;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EstatePropertyData {
    private String propertyTypeUuid;
    private Address address;
    private String propertyName;
    private String propertyType;
    private String city;
    private String microMarket;
}
