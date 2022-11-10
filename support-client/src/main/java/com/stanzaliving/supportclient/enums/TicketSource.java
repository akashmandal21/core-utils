package com.stanzaliving.supportclient.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum TicketSource {
    ALFRED("ALFRED"),
    SIGMA("SIGMA"),
    SUPPORT_EMAIL("SUPPORT EMAIL"),
    SOCIAL("SOCIAL");

    private static final Map<String, TicketSource> map = new HashMap<>();

    static {
        for (TicketSource ticketSource : TicketSource.values()) {
            map.put(ticketSource.value, ticketSource);
        }
    }

    private final String value;

    public static TicketSource enumOf(String ticketSource) {
        return map.get(ticketSource);
    }
}
