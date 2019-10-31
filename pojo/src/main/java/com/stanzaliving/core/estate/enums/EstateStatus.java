package com.stanzaliving.core.estate.enums;

import lombok.Getter;

@Getter
public enum EstateStatus {

	DRAFT_IN_PROGRESS("Draft In Progress"),
	SHORTLISTED("Shortlisted"),
	REJECTED("Rejected"),
	DOCUMENTS_NEEDED("Documents Needed"),
	INFORMATION_NEEDED("Information Needed");

	private String name;

	private EstateStatus(String name) {
		this.name = name;
	}
}