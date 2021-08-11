package com.stanzaliving.ventaInvoice.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DealBillToDto {
    private String addressLine1;
    private String addressLine2;
    private String cityName;
    private String cityUuid;
    private String postalCode;
}
