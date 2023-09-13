/**
 * @author gaurav.likhar
 * @date 10/09/23
 * @project_name core-utils
 **/

package com.stanzaliving.ruleEngine.dto;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
public class SalesCommandResidenceViewDto {
    private LabelValueObject residence;

    private LabelValueObject micromarket;

    private LabelValueObject city;

    private List<RuleExpressionDto> bookingConfig;

    private List<RuleExpressionDto> scholarSessionDate;

    private List<RuleExpressionDto> commercialCard;

    private Map<String, Map<String, List<RuleExpressionDto>>> priceStrategy;
}
