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
public class VendorKycDetailsDto {

    private String uuid;

    private String companyType;

    private String panNumber;

    private String panUrl;

    private String registrationNumber;

    private String registrationCertificateUrl;

    private String msmeRegistered;

    private String msmeCertificateNumber;

    private String msmeCertificateUrl;

    private String createdBy;

    private String updatedBy;
}
