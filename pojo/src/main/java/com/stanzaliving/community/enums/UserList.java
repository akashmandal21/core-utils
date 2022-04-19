package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserList {
	
    ALL("all"),
    SPECIFIC_LOCATION("specificLocation"),
    CSV_URL("csv_url");

    private final String name;
}
