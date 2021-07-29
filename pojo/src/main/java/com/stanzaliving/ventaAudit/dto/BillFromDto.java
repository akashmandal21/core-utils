package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BillFromDto {
    private String name;
    private String addressLine;
    private String microMarketName;
    private String cityName;
    private int zipCode;
    private String gstIn;
    private String pan;
    private String footerAddress;
    private String cin;
    private String footerMicroMarketName;
    private String footerCityName;
    private String footerZipCode;

}
