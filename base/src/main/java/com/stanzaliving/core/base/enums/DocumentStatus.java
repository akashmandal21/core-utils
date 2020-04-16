package com.stanzaliving.core.base.enums;

public enum DocumentStatus {

	ALL("ALL"),
	NOTUPLOADED("Not Uploaded Documents"),
	PENDING("Pending Verification"),
	REJECTED("Rejected Verification"),
	APPROVED("Approved Verification");

	String name;

	private DocumentStatus(String name) {
		this.name = name;
	}

}