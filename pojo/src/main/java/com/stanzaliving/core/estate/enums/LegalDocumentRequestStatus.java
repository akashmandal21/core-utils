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
public enum LegalDocumentRequestStatus {

	APPROVED("Approved"),
	PENDING("Pending");
	
	private String desc;
	
	LegalDocumentRequestStatus(String desc) {
		this.desc = desc;
	}
}
