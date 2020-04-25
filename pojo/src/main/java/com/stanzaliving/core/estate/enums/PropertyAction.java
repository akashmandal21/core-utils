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

	CALLBACK_PROPERTY_TO_UNDER_DRAFT("Callback Property to Under Draft" , 1, "Request Raised (Property To Under Draft)"),
	CALLBACK_PROPERTY_TO_L1_APPROVED("Callback Property to L1 Approved", 2, "Request Raised (Property To L1)"),
	LOI_REQUEST("LOI Request", 3, "Request Raised (LOI)"),
	//ATL_REQUEST("ATL Approval Request Raised", 4, "Request Raised (ATL)"),
	DROP_PROPERTY("Drop Property Request Raised", 5, "Request Raised (Property Drop)");

	private String actionName;
	private String requestRaisedDesc;
	private int order;
	
	private PropertyAction(String actionName, int order, String requestRaisedDesc) {
		this.requestRaisedDesc = requestRaisedDesc;
		this.actionName = actionName;
		this.order = order;
	}
}
