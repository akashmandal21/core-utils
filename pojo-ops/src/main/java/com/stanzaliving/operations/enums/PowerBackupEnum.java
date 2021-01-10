package com.stanzaliving.operations.enums;

import com.stanzaliving.core.enums.helpers.EnumValue;

import lombok.Getter;

@Getter
public enum PowerBackupEnum implements EnumValue{
	INVERTOR("Inverter"),
	DG("DG");
	
	private String value;
	
	private PowerBackupEnum(String value) {
		this.value = value;
	}
}
