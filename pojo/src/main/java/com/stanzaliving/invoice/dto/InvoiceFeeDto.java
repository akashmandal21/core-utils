package com.stanzaliving.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceFeeDto {

    private String invoiceUuid;

    private String poUuid;

    private String poFeeUuid;

    private String feeName;

    private BigDecimal poFeeAmount;

    private BigDecimal poFeeGst;

    private BigDecimal poOtherFeeTotalAmt;

    private BigDecimal invoicedOtherFee;

}