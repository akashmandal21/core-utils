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
public enum EstateLegalDocumentType {

	ATL("ATL"),
	LOI("LOI");
	
	private String documentName;
	
	EstateLegalDocumentType(String documentName) {
		this.documentName = documentName;
	}
}
