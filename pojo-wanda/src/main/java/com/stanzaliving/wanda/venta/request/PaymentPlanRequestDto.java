package com.stanzaliving.wanda.venta.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlanRequestDto {
    @NotNull
    private String bookingUuid;
    
    @Builder.Default
    private Boolean ledgerView = Boolean.FALSE;
    
    @Builder.Default
    private Boolean savePaymentPlan = Boolean.FALSE;
}