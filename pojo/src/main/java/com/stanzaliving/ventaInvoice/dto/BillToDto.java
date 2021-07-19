package com.stanzaliving.ventaInvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BillToDto {
    private String residentId;
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String email;
    private String phoneNumber;
    private String residenceId;
    private String residenceName;
    private String cityId;
    private String cityName;
    private String microMarketId;
    private String microMarketName;
}
