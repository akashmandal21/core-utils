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

public class MinimumQualifierDto {

    private String ruleNo;

    private String minimumQualifier;

    private String minimumQualifierCondition;

    private int minimumQualifierValue;

    private String contestRuleUuid;
}
