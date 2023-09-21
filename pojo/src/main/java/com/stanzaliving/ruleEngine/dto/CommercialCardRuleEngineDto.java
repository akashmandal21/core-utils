/**
 * @author gaurav.likhar
 * @date 15/09/23
 * @project_name commercial-code-service
 **/

package com.stanzaliving.ruleEngine.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
public class CommercialCardRuleEngineDto {
    Double distributionPercentage;
    RuleExpressionDto ruleExpressionDto;
}
