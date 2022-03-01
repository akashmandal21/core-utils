package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PricingStrategyBookingDto {
    private String uuid;
    private String status;
    private String rulesUuid;
    private String lowerBoundOperator;
    private int lowerBoundOperand;
    private String upperBoundOperator;
    private int upperBoundOperand;
    private String discount;
}
