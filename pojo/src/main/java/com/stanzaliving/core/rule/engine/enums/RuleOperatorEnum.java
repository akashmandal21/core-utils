package com.stanzaliving.core.rule.engine.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

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

	private static List<EnumListing<RuleOperatorEnum>> enumListings = new ArrayList<>();

	static {

		for (RuleOperatorEnum operatorEnum : RuleOperatorEnum.values()) {
			enumListings.add(EnumListing.of(operatorEnum, operatorEnum.getDisplayText()));
		}
	}

	public static List<EnumListing<RuleOperatorEnum>> getOperatorListing() {
		return enumListings;
	}
}