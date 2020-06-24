package com.stanzaliving.operations.enums;

import lombok.Getter;

@Getter
public enum PowerBackupEnum implements EnumValue{
	INVERTOR("Invertor"),
	DG("DG");
	
	private String value;
	
	private PowerBackupEnum(String value) {
		this.value = value;
	}
}
