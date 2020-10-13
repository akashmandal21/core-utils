package com.stanzaliving.internet.enums;

import com.stanzaliving.core.enums.helpers.EnumValue;

import lombok.Getter;

@Getter
public enum InternetVendor implements EnumValue {

	SPECTRA("SPECTRA"),
	JIO("Jio"),
	ION("Ion");

	private String vendor;

	public String getVendor() {
		return vendor;
	}

	private InternetVendor(String vendor) {
		this.vendor = vendor;
	}

	@Override
	public String getValue() {
		return vendor;
	}

}