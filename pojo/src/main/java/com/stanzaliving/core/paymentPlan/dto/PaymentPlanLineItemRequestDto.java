package com.stanzaliving.core.paymentPlan.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPlanLineItemRequestDto {

    private List<Long> paymentPlanIds;
}
