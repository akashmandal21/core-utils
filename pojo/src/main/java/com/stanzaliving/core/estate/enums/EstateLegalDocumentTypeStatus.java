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
public enum EstateLegalDocumentTypeStatus {

	LOI_APPROVAL_REQUEST_RAISED("LOI Approval Request Raised"),
	LOI_REQUEST_APPROVED("LOI Request Approved"),
	ATL_APPROVAL_REQUEST_RAISED("ATL Approval Request Raised"),
	ATL_REQUEST_APPROVED("ATL Request Approved");
	
	private String description;
	
	EstateLegalDocumentTypeStatus(String description) {
		this.description = description;
	}
}
