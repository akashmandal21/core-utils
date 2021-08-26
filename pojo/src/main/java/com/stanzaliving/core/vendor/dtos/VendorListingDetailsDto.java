package com.stanzaliving.core.vendor.dtos;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class VendorListingDetailsDto{

    private String address;
    private String contactNumber;
    private String email;
    private String city;
    private String state;
    private String pin;
    private String pocName;
    private String gstNo;
    private String panNo;
    private VendorListingDto vendorListingDto;
}
