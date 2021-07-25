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
public class PaymentPlanResponseDto {
    private List<InstallmentResponseDto> paymentPlan;
    private String installmentTypeStr;
    private PaymentTerm paymentTerm;
    private Boolean isSelected;
    private String view;
    private int upFrontPaymentMonth;
}
