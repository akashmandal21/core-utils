package com.stanzaliving.booking.dto.response;

import com.stanzaliving.booking.dto.InstalmentPaymentPlan;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPlanResponseDto {

    private Double totalAmount;
    private Double gstAmountLabel;
    private Double totalDiscountApplied;

    private List<InstalmentPaymentPlan> instalments;

}