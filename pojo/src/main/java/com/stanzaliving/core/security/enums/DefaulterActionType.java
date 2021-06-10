package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum DefaulterActionType {
    CALLED_RESIDENT("Called Resident but did not respond"),
    CALL_OUTCOME("Call Outcome"),
    VISITED_ROOM("Visited room but could not find"),
    OTHER("Other");

    private final String label;

    private DefaulterActionType(String label){
        this.label = label;
    }
}
