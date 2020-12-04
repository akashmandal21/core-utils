package com.stanzaliving.core.invoice.dto;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ErpInvoiceUpdateDto {
    private String poUuid;
    private BigDecimal advancedInvoiced;
    private BigDecimal regularInvoiced;
    private BigDecimal advancePaid;
    private BigDecimal regularPaid;
    private BigDecimal totalInvoiced;
    @Builder.Default
    private boolean itemsPending = true;
}
