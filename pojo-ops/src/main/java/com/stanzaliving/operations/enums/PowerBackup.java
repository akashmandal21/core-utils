package com.stanzaliving.operations.enums;

import lombok.Getter;

@Getter
public enum PowerBackup {
	INVERTOR("Invertor"),
	DG("DG");
	
	private String value;
	
	private PowerBackup(String value) {
		this.value = value;
	}
}
