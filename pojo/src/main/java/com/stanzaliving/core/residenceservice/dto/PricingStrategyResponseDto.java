package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PricingStrategyResponseDto {

    private String strategyUuid;
    private String ruleUuid;
    private String upperBoundOperator;
    private int upperBoundOperand;
    private String lowerBoundOperator;
    private int lowerBoundOperand;
    private String discount;



}
