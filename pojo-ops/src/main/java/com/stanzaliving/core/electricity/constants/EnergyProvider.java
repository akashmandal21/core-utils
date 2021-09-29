package com.stanzaliving.core.electricity.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum EnergyProvider {

    IDEAL(1, "IDEAL"),
    GRAMPOWER(2, "GRAMPOWER");

    private Integer id;
    private String provider;

    private static final Map<Integer, EnergyProvider> byId = new HashMap<>();

    static {
        for (EnergyProvider eProvider : EnergyProvider.values()) {
            byId.put(eProvider.id, eProvider);
        }
    }
}
