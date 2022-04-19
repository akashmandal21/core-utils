package com.stanzaliving.core.paymentPlan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceGenerationResponseDto {

    private int totalInvoiceObjects;
    private int invoiceObjectsPublished;
    private int invoiceObjectsNotPublished;
    private String message;
}
