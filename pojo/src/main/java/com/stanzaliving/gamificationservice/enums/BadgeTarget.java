package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Keshav Singh
 * @date 12/9/2021
 **/
@Getter
@AllArgsConstructor
public enum BadgeTarget {

	BOOKING("booking"),PREBOOKING("prebooking"), VISIT_COMPLETED("visit-completed"), FINAL_BOOKING("final-booking");

	private String badgeTargetStatus;

}
