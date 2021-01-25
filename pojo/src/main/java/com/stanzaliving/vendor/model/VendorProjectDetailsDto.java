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
public class VendorProjectDetailsDto {

    private String uuid;

    private String clientName;

    private String projectLocation;

    private String projectValueInRs;

    private String projectYear;

    private String createdBy;

    private String updatedBy;
}
