package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlanResponseDto {
    private HashMap<String, String> bookingChargesApplicable;
    private DiscountResponseDto discountResponseDto;
    private List<PaymentPlanDto> paymentPlan;
    private Double aggregatedBookingAmount;
    private String contractStartDate;
    private String installment;

}
