package com.stanzaliving.core.rule.engine.dto;

import com.stanzaliving.core.base.enums.RuleOperatorEnum;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 01-May-2020
 *
 */

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