package com.stanzaliving.core.paymentPlan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPaymentPlanRequestDto {
    private String bookingUuid;
    private LocalDate executionDate;
    private boolean completeInvoice;
}
