package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PricingStrategyBookingDto {
    private String rulesUuid;
    private String lowerBoundOperator;
    private int lowerBoundOperand;
    private String upperBoundOperator;
    private int upperBoundOperand;
    private String discountSingle;
    private String discountFlat;
    private String strategyUuid;

    private String discount;
}
