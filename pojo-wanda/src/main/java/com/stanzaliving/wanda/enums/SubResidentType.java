package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SubResidentType {
    UNIVERSITY("UNIVERSITY"), COACHING("COACHING"), OTHERS("OTHERS");
    private String name;
}
