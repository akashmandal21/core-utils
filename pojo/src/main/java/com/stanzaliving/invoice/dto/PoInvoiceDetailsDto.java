package com.stanzaliving.invoice.dto;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PoInvoiceDetailsDto {

    @EqualsAndHashCode.Include
    private String poUuid;

    private String poNumber;

    private BigDecimal poAmt;

    private Department department;

    @Builder.Default
    private BigDecimal poAdvAmt = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal totalInvoiceAmt = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal totalAdvanceInvoiceAmt = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal totalPaidAmt = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal totalAdvancedPaidAmt = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal totalAmtDue = BigDecimal.ZERO;

    private BigDecimal invoicedPercentage;

    private BigDecimal invoicePaidPercentage;

    @Builder.Default
    private boolean isPenaltyApplied = Boolean.FALSE;

    private String latestApprovalBy;

    private Date latestApprovalAt;

    private String latestPaymentBy;

    private Date latestPaymentAt;

}
