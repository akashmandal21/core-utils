package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum PointFrequencyEnum {

    DAILY("DAILY"),WEEKLY("WEEKLY"),MONTHLY("MONTHLY");

    private final String pointFrequencyName;
        }
