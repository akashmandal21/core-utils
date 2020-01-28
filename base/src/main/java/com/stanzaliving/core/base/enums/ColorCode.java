package com.stanzaliving.core.base.enums;

import lombok.Getter;

@Getter
public enum ColorCode {

	BLACK("#000000"),
	RED("#F1C0C6"),
	GREEN("#B8E986"),
	WHITE("#FFFFFF");

	private String colorCode;

	ColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

}