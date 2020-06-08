package com.stanzaliving.internet.enums;

import lombok.Getter;

@Getter
public enum InternetVendor {

	SPECTRA("SPECTRA");

	private String vendor;

	public String getVendor() {
		return vendor;
	}

	private InternetVendor(String vendor) {
		this.vendor = vendor;
	}

}