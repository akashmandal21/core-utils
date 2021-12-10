package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Keshav Singh
 * @date 12/9/2021
 **/
@Getter
@AllArgsConstructor
public enum TargetCondition {

	COUNT_EQUAL_TO("CountEqualTo"),COUNT_LESS_THEN("CountLessThen"),COUNT_GREATER_THEN("CountGreaterThen");

	private String targetConditionStatus;

}
