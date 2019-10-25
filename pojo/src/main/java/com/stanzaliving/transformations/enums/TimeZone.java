package com.stanzaliving.transformations.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TimeZone {

	UTC(0000),
	IST(0530);

	int timeDifference;

}