/**
 * 
 */
package com.stanzaliving.transformations.enums;

import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
public enum BoqStatus {

	NOT_STARTED("Not Started"),
	DRAFT_IN_PROGRESS("Under Draft"),
	SEND_FOR_APPROVAL("Send For Approval"),
	SENT_BACK("Sent Back"),
	APPROVED("Approved");
	
	private String desc;

	private BoqStatus(String name) {
		this.desc = name;
	}
}
