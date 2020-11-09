package com.stanzaliving.core.vendor.dtos;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AddressInformation {

    private String addressLine1;
    private String addressLine2;
    private String pincode;
    private String country;
    private String state;
    private String city;

    private String countryName;
    private String stateName;
    private String cityName;
}
