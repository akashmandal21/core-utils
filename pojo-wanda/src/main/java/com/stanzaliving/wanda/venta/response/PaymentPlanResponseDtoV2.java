package com.stanzaliving.wanda.venta.response;

import java.util.List;

import com.stanzaliving.booking.enums.PaymentTerm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlanResponseDtoV2 {
    private List<InstallmentResponseDto> paymentPlan;
    private String installmentTypeStr;
    private PaymentTerm paymentTerm;
    private Boolean isSelected;
    private String view;
    private int upFrontPaymentMonth;
    @Builder.Default
    private Double upsell=0d;
    @Builder.Default
    private Double bumpUpPrice=0d;
}
