package com.stanzaliving.core.paymentPlan.dto;


import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPlanAndLineItems {

    List<PaymentPlan> paymentPlanList;

    List<PaymentPlanLineItem> paymentPlanLineItemList;
}
