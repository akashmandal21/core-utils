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
public class VendorPoDownloadDataDto {

    private String companyName;

    private String pocName;

    private String pocEmail;

    private String pocMobile;

    private String address;

    private String gst;

    private String pan;

    private String paymentTerm;
}
