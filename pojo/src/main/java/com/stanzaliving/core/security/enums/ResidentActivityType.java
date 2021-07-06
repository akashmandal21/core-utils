package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum ResidentActivityType {
    IN_PROPERTY("Resident in property"),
    FACIAL_RECOGNITION("Facial-recognition"),
    INTERNET_USAGE("Internet-usage"),
    MEAL_SCAN("Meal-scan"),
    RESIDENT_PRESENT("Resident-present");

    public final String label;

    ResidentActivityType(String label) {
        this.label = label;
    }
}
