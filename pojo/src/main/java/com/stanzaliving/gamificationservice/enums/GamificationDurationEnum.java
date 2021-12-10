package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GamificationDurationEnum {

    DAYS("DAYS"), WEEKS("WEEKS"), MONTHS("MONTHS"), YEARS("YEARS");

    private String durationUnit;
}
