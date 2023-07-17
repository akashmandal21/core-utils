package com.stanzaliving.projectplanningservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskOwnerTypeEnum {
    BY_ROLE("BY_ROLE"),
    BY_USER("BY_USER");

    private String type;
}
