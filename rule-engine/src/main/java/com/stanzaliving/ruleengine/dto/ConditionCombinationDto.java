package com.stanzaliving.ruleengine.dto;

import com.stanzaliving.core.base.enums.RuleOperatorEnum;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ConditionCombinationDto {
	private String aggregator = "all";

	private Boolean value = true;

	private String leftOperand;

	private RuleOperatorEnum operator;

	private String rightOperand;

	private List<ConditionCombinationDto> conditions;

}
