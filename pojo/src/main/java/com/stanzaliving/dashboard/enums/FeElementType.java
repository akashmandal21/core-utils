package com.stanzaliving.dashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FeElementType {

	INTEGER,
	DOUBLE,
	CURRENCY_INTEGER,		//INR
	CURRENCY_DOUBLE,		//INR
	USD_INTEGER,
	USD_DOUBLE,
	PERCENT_INTEGER,
	PERCENT_DOUBLE,
	STRING,
	FRACTION

}