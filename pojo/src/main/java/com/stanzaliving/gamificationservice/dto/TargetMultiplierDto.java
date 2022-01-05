package com.stanzaliving.gamificationservice.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class TargetMultiplierDto {

    private String targetMultiplierInput;

    private int targetMultiplierMinimumPercentage;

    private int targetMultiplierMaximumPercentage;

    private int targetMultiplierPoints;

    private String ruleNo;

    private String uuid;

    private String contestRuleUuid;
}
