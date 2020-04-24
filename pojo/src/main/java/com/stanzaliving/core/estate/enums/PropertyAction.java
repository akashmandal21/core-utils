/**
 * 
 */
package com.stanzaliving.core.estate.enums;

import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
public enum PropertyAction {

	CALLBACK_PROPERTY_TO_UNDER_DRAFT("Callback Property to Under Draft"),
	CALLBACK_PROPERTY_TO_L1_APPROVED("Callback Property to L1 Approved"),
	LOI_REQUEST("LOI Request"),
	ATL_REQUEST("ATL Request"),
	DROP_PROPERTY("Drop Property");

	private String actionName;
	
	private PropertyAction(String actionName) {
		this.actionName = actionName;
	}
}
