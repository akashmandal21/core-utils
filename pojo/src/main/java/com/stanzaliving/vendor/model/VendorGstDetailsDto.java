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
public class VendorGstDetailsDto {

    private String uuid;

    private String gstCompanyName;

    private String gstState;

    private String gstin;

    private AddressDto gstRegisteredAddress;

    private String gstCertificateUrl;

    private String createdBy;

    private String updatedBy;
}
