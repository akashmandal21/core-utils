package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RuleFunctionEnum {

    EVENT("Event"),TARGET("TARGET"),RANK("RANK");

    private final String ruleFunctionName;

}
