package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GstInformationDto {
    private String uuid;
    private String cin;
    private String pan;
    private String cityBillingInformationId;
    private String cityUuid;
    private String gstin;
    private String gstStateId;
    private String gstState;
    private String address;
    private String footerAddress;
    private String cityName;
    private String microMarketName;
    private int zipcode;
    private String footerMicroMarketUuid;
    private String footerCityUuid;
    private String footerMicroMarketName;
    private String footerCityName;
    private String footerZipcode;
    private String gstCode;
    private String companyName;
}