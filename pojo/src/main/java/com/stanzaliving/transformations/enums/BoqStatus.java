/**
 * 
 */
package com.stanzaliving.transformations.enums;

/**
 * @author raj.kumar
 *
 */
public enum BoqStatus {

	DRAFT_IN_PROGRESS("Under Draft"),
	SEND_FOR_APPROVAL("Send For Approval"),
	SENT_BACK("Sent Back"),
	APPROVED("Approved");
	
	private String name;

	private BoqStatus(String name) {
		this.name = name;
	}
}
