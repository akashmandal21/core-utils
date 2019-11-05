package com.stanzaliving.core.estate.enums;

import lombok.Getter;

@Getter
public enum EstateStatus {

	DRAFT_IN_PROGRESS("Draft In Progress"),
	SHORTLISTED("Shortlisted"),
	REJECTED("Rejected"),
	DOCUMENTS_NEEDED("Documents Needed"),
	INFORMATION_NEEDED("Information Needed"),
	SENT_BACK_BY_BDHEAD("Sent Back By BD Head");

	private String name;

	private EstateStatus(String name) {
		this.name = name;
	}
}