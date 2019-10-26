package com.stanzaliving.core.estate.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EstateStatus {
	
	DRAFT_IN_PROGRESS("Draft In Progress"),
	SHORTLISTED("SHORTLISTED"),
	REJECTED("REJECTED"),
	DOCUMENTS_NEEDED("DOCUMENTS NEEDED");

	private String status;
}
