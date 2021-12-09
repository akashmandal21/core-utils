package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Keshav Singh
 * @date 12/9/2021
 **/
@Getter
@AllArgsConstructor
public enum PointCondition {

	MAXIMUM("maximum"),MINIMUM("minimum");

	private String pointConditionStatus;

}
