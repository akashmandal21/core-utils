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
public class VendorItemDetailsDto {

    private String uuid;

    private String itemCode;

    private String itemCategory;

    private String itemParticular;

    private String itemSpecification;

    private String itemRateInRs;

    private Boolean isApproved;

    private String createdBy;

    private String updatedBy;
}
