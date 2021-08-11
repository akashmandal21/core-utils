package com.stanzaliving.core.paymentPlan.dto;

import com.stanzaliving.core.paymentPlan.enums.LineItemValue;
import lombok.*;
import java.util.Map;


@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPlanLineItem {

    private Long paymentPlanId;

    private Long id;

    private LineItemValue lineItemValue;

    private Double amount;

    private Double cgst;

    private Double sgst;

    private Double igst;

    private Map<String,String> metaData;
}
