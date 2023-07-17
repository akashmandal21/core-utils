package com.stanzaliving.support.enums;

import lombok.Getter;

@Getter
public enum TicketSlaStatus {
    DUE_IN_X_DAYS("DUE_IN_X_DAYS", "#E6E9EA"),
    DUE_IN_Y_HOURS("DUE_IN_Y_HOURS", "FFD9DF"),
    NEARING_OR_BREACHED("NEARING_OR_BREACHED", "#FFD9DF"),
    IN_TIME("IN_TIME", "#D0F2EC"),
    VIOLATED("VIOLATED", "#FFD9DF"),
    NOT_APPLICABLE("NOT_APPLICABLE", "#FFD9DF"),
    NOT_DEFINED("NOT_DEFINED", "#FFD9DF");

    String name;
    String color;

    TicketSlaStatus(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
