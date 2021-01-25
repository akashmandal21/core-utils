package com.stanzaliving.vendor.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class VendorPocDetailsDto {

    private String uuid;
    @EqualsAndHashCode.Include
    private String pocName;

    @EqualsAndHashCode.Include
    private String pocEmail;

    @EqualsAndHashCode.Include
    private String pocMobile;

    private String pocDesignation;

    private String createdBy;

    private String updatedBy;
    
    private String vendorId;
}
