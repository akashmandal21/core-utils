/**
 * 
 */
package com.stanzaliving.sfr.enums;

/**
 * @author raj.kumar
 *
 */
public enum SfrStatus {

	 SFR_PENDING("SFR Pending"),
	 DRAFT_IN_PROGRESS("Draft In Progress"),
	 SFR_COMPLETED("SFR Completed");
	
	private String name;
	
	private SfrStatus(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
