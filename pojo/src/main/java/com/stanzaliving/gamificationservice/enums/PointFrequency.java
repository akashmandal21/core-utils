package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Keshav Singh
 * @date 12/9/2021
 **/

@Getter
@AllArgsConstructor
public enum PointFrequency {

	DAILY("daily"),WEEKLY("weekly"),MONTHLY("monthly"),CONTEST_END("contest-end");

	private  String pointFrequencyStatus;

}
