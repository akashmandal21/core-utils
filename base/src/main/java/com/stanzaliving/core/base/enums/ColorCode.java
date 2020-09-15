package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ColorCode {

	BLACK("#000000"),
	RED("#F1C0C6"),
	GREEN("#B8E986"),
	WHITE("#FFFFFF");

	private String colorCode;

}