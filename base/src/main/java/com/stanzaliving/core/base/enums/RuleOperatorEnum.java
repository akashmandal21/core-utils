package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RuleOperatorEnum {

	GT(">", ">"),
	GT_EQ(">=", ">="),
	LT("<", "<"),
	LT_EQ("<=", "<="),
	EQ("=", "="),
	CONGICUTIVE("--", "in consecutive days"),
	NOT_CONGIVUTIVE("---", "not in consecutive days");

	public String operator;

	private String displayText;
}