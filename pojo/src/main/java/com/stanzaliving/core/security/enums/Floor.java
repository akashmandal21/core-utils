package com.stanzaliving.core.security.enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public enum Floor {
    GROUND_FLOOR("Ground Floor"),
    FIRST_FLOOR("1st Floor"),
    SECOND_FLOOR("2nd Floor"),
    THIRD_FLOOR("3rd Floor"),
    FOURTH_FLOOR("4th Floor"),
    FIFTH_FLOOR("5th Floor");

    public final String label;

    Floor(String label) {
        this.label = label;
    }

    public static List<String> getFloors() {
        return new ArrayList<>(
                Arrays.asList(
                        Floor.GROUND_FLOOR.name(),
                        Floor.FIRST_FLOOR.name(),
                        Floor.SECOND_FLOOR.name(),
                        Floor.THIRD_FLOOR.name(),
                        FOURTH_FLOOR.name(),
                        Floor.FIFTH_FLOOR.name()));
    }
}
