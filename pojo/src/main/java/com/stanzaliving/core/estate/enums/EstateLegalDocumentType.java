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

	ATL("ATL", 7),
	LOI("LOI", 8);
	
	private String documentName;
	private int screenNum;
	
	EstateLegalDocumentType(String documentName, int screeNum) {
		this.documentName = documentName;
		this.screenNum = screeNum;
	}
}
