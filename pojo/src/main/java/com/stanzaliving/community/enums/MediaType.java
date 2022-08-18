package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MediaType {

	IMAGE("IMAGE"), VIDEO("VIDEO"), GIF("GIF");

	private String displayName;
}
