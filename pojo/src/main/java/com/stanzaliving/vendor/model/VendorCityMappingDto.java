package com.stanzaliving.vendor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class VendorCityMappingDto {

    private String vendorDetailsId;

    private String city;

    private String state;

    private String country;

    private Boolean isApproved;

    private String createdBy;

    private String updatedBy;

}
