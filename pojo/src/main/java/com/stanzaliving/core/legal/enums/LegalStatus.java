package com.stanzaliving.core.legal.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LegalStatus {
	
	PENDING("pending"), APPROVED("approved");
	
	private String status;

}
