package com.stanzaliving.core.estate.embeddedinfos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String addressLine1;

    private String addressLine2;

    private String landmark;

    private String cityName;

    private String stateName;

    private String postalCode;
    private String countryName;
}
