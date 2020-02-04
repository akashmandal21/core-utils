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

	NOT_STARTED("Not Started", "#e5e3e3"),
	DRAFT_IN_PROGRESS("Under Draft", "#e5e3e3"),
	SEND_FOR_APPROVAL("Send For Approval", "#FFC300"),
	SENT_BACK("Sent Back", "#d41111"),
	APPROVED("Approved", "#77baa6");
	
	private String desc;
	private String color;

	private BoqStatus(String name, String color) {
		this.desc = name;
		this.color = color;
	}
}