package com.stanzaliving.core.rule.engine.dto;

import com.stanzaliving.core.base.enums.RuleOperatorEnum;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ConditionDto {

	private String leftOperand;

	private RuleOperatorEnum operator;
	
	private String operatorValue;

	private String rightOperand;
}