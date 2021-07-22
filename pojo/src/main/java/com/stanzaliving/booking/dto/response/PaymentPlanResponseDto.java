package com.stanzaliving.booking.dto.response;

import java.util.List;

import com.stanzaliving.booking.dto.InstalmentPaymentPlan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlanResponseDto {

    private Double totalAmount;

    private Double totalDiscountApplied;

    private List<InstalmentPaymentPlan> instalments;
}