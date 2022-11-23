package com.stanzaliving.approve.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MailLevel {
    REQUESTOR("REQUESTOR"),
    CURRENT_LEVEL("CURRENT_LEVEL"),
    PREVIOUS_LEVELS("PREVIOUS_LEVELS"),
    NEXT_LEVELS("NEXT_LEVELS");

    private String level;
}
