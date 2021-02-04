package com.stanzaliving.core.invoice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class InvoiceDeductionEmailDto {
    private String amount;
    private String reason;
    private String updatedby;
}
