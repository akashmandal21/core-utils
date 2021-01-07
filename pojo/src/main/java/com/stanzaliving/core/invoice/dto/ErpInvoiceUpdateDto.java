package com.stanzaliving.core.invoice.dto;

import com.stanzaliving.core.po.generic.enums.GenericPOType;
import lombok.*;

import java.math.BigDecimal;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ErpInvoiceUpdateDto {
    private String poUuid;
    private GenericPOType poType;
    private BigDecimal advancedInvoiced;
    private BigDecimal regularInvoiced;
    private BigDecimal advancePaid;
    private BigDecimal regularPaid;
    private BigDecimal totalInvoiced;
    private BigDecimal otherFeeRaised;
    private boolean allowedAbovePoAmount;
    @Builder.Default
    private boolean itemsPending = false;

    private Map<String,BigDecimal> invoicedItems;
}
