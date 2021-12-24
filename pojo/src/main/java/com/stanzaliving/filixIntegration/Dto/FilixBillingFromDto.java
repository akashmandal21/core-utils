package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.ventaInvoice.dto.AddressDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilixBillingFromDto {
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
    private String gstCode;
}
