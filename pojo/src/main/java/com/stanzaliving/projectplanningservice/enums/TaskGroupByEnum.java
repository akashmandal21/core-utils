package com.stanzaliving.projectplanningservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskGroupByEnum {

        STATUS("status"),
        OWNER("owner"),
        MODULES("modules");

        private String type;
    }

