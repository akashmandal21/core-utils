package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum RequestReason {
    GOING_HOME("Going Home"),
    GOING_TO_RELATIVES("Going to Relatives"),
    GOING_ON_A_TRIP("Going on a Trip"),
    OTHER("Other"),
    FRIENDS_PLACE("Friend's-Place"),
    NIGHT_OUT("Night-out"),
    PARTY("Party");

    private final String label;

    private RequestReason(String label){
        this.label = label;
    }
}
