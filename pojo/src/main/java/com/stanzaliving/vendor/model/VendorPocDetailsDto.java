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
public class VendorPocDetailsDto {

    private String uuid;

    private String pocName;

    private String pocEmail;

    private String pocMobile;

    private String pocDesignation;

    private String createdBy;

    private String updatedBy;
    
    private String vendorId;
}
