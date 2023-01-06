package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DigioAddressDto {

    private String address;
    private String locality_or_post_office;
    private String district_or_city;
    private String state;
    private String pincode;

}
