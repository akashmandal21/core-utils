package com.stanzaliving.core.invoice.dto;


import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class InvoiceRegularItemDto {

    private String itemUuid;
    private String poNumber;
    private String invoiceCode;
    private BigDecimal unitRate;
    private Double gst;
    private BigDecimal otherFee;
    private BigDecimal otherFeeTax;
    private BigDecimal invoiceQty;
}
