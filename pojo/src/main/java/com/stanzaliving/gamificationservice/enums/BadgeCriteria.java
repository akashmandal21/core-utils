package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Keshav Singh
 * @date 12/9/2021
 **/
@Getter
@AllArgsConstructor
public enum BadgeCriteria {

	POINTS("points"),TARGET("target");

	private String badgeCondition;

}
