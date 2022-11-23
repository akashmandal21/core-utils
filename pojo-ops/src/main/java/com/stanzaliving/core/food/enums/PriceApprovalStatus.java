/**
 * 
 */
package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 12-Jun-2020
 *
 **/
@Getter
@AllArgsConstructor
public enum PriceApprovalStatus {

	SUBMITTED("Submitted for Approval"),
	APPROVED("Approved"),
	REJECTED("Rejected");

	private String statusName;
}