package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PricingStrategyRulesResponseDto {

    private String uuid;
    private String ruleUuid;
    private String upperBoundOperator;
    private String lowerBoundOperator;
    private int upperBoundOperand;
    private int lowerBoundOperand;
    private String status;
}
