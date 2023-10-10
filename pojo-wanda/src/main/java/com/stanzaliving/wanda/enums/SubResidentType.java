package com.stanzaliving.wanda.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum SubResidentType {
    UNIVERSITY("UNIVERSITY"), COACHING("COACHING"), OTHERS("OTHERS");
    private String name;

    @JsonCreator
    public static SubResidentType decode(final String name) {
        return Stream.of(SubResidentType.values()).filter(targetEnum -> targetEnum.name.equals(name)).findFirst().orElse(OTHERS);
    }

    @JsonValue
    public String getName() {
        return name;
    }
}
