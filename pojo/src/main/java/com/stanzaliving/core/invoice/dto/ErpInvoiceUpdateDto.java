package com.stanzaliving.core.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErpInvoiceUpdateDto {
    private String poUuid;
    private BigDecimal amountPending;
    private BigDecimal amountPaid;
    private BigDecimal advancedPaid;
    private BigDecimal advancedPending;
}
