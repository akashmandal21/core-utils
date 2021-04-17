package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventType {
    DONE_BY_USERS("Done By Users"),
    NOT_DONE_BY_USERS("Not Done By Users");

    String typeOfEvent;

}
