package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BillToDTO {
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
    private String postalCode;
}
