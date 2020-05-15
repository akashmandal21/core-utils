package com.stanzaliving.core.rule.engine.dto;

import com.stanzaliving.core.rule.engine.enums.RuleOperatorEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
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