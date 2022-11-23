package com.stanzaliving.core.security.enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public enum Dues {
    NO_DUES("No dues"),
    DUES_PENDING("Dues pending");

    private final String label;

    private Dues(String label){
        this.label = label;
    }

    public static List<String> getDues() {
        return new ArrayList<>(Arrays.asList(NO_DUES.name(), DUES_PENDING.name()));
    }
}
