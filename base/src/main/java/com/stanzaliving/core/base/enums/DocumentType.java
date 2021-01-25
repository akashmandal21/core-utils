package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DocumentType {

	POLICE_VERIFICATION(0),
	KYC(1);

	int id;

}