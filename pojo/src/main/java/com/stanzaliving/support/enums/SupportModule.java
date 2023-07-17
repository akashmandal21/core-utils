package com.stanzaliving.support.enums;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum SupportModule {
    BLISS_DASHBOARD("Bliss Dashboard"),
    TICKET_ESCALATION("Ticket Escalation"),
    TICKET_RESOLUTION("Ticket Resolution");

    private static final Map<String, SupportModule> map = new HashMap<>();

    static {
        for (SupportModule supportModule : SupportModule.values()) {
            map.put(supportModule.value, supportModule);
        }
    }

    private final String value;

    public static SupportModule enumOf(String supportModule) {
        return map.get(supportModule);
    }

    @Override
    public String toString() {
        return value;
    }
}
