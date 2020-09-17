package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DocumentStatus {

	ALL("ALL"),
	NOTUPLOADED("Not Uploaded Documents"),
	PENDING("Pending Verification"),
	REJECTED("Rejected Verification"),
	APPROVED("Approved Verification");

	String name;

}