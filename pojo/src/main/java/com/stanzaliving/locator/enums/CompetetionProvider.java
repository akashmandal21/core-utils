package com.stanzaliving.locator.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CompetetionProvider {

	OYO_LIFE("Oyo Life","oyo_life"),OXFORD_CAPS("Oxford Caps","oxford_caps"),ZOLO("Zolo","zolo"),COLIVE("Colive","colive"),NESTAWAY("Nest Away","nestaway");
	
	private String name;
	private String dbTableName;
}
