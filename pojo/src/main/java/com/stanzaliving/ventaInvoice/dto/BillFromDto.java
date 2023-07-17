package com.stanzaliving.ventaInvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BillFromDto {
    private String name;
    private AddressDto address;
    private String cityUuid;
    private String gstIn;
    private String pan;
    private String cin;
    private String footerAddress;
    private String gstState;
    private String microMarketName;
    private String cityName;
    private int zipCode;
    private String footerMicroMarketUuid;
    private String footerCityUuid;
    private String footerMicroMarketName;
    private String footerCityName;
    private String footerZipcode;
    private String gstCode; //gst state code
    private String landlordId;
    @Builder.Default
    private Double landlordOwnershipPercentage = 100.0;
}