package com.stanzaliving.collector.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInvoiceTransactionDto {

    private String cityUuid;
    private String micromarketUuid;
    private String residenceUuid;
    private Double payableAmount;
    private Double arrearsAmount;
    private Double pendingAmount;

}
