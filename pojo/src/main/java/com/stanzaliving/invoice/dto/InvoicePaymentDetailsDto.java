package com.stanzaliving.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoicePaymentDetailsDto {

    private String invoiceUuid;

    private String paymentRef;

    private Date paymentDate;

    private String paymentProofDocUrl;

    private BigDecimal amtPaid;

    private BigDecimal tdsAmt;

    private BigDecimal otherDeductionAmt;

    private String otherDeductionReason;

}
