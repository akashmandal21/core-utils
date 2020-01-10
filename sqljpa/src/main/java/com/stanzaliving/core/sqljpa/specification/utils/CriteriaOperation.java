package com.stanzaliving.core.sqljpa.specification.utils;

public enum CriteriaOperation {

	TRUE("true"),
	FALSE("false"),
	LIKE("like"),
	EQ("="),
	NOT_EQ("!="),
	GTE(">="),
	GT(">"),
	LTE("<="),
	LT("<"),
	DATE_EQ("="),
	DATE_GTE(">="),
	DATE_GT(">"),
	DATE_LTE("<="),
	DATE_LT("<"),
	LOCAL_DATE_EQ("="),
	LOCAL_DATE_GT(">"),
	LOCAL_DATE_LT("<"),
	LOCAL_DATE_GTE(">="),
	LOCAL_DATE_LTE("<="),
	IN("in"),
	REGEXP("regexp"),
	FIND_IN_SET("find_in_set"),
	ENUM_EQ("=");

	CriteriaOperation(String op) {
		operation = op;
	}

	private String operation;

	public String getOperation() {
		return operation;
	}

}