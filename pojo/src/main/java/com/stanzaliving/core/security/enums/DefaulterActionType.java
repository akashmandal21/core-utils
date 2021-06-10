package com.stanzaliving.core.security.enums;

public enum DefaulterActionType {
    CALLED_RESIDENT("Called Resident but did not respond"),
    CALL_OUTCOME("Call Outcome"),
    VISITED_ROOM("Visited room but could not find"),
    OTHER("Other");

    public final String label;

    private DefaulterActionType(String label){
        this.label = label;
    }
}
