package com.stanzaliving.core.base.enums;

import lombok.Getter;

@Getter
public enum CurrencyCode {
	INR("INR");

	private String displayName;

	CurrencyCode(String displayName) {
		this.displayName = displayName;
	}

}