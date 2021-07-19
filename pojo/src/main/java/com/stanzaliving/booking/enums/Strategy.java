package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Strategy {

    WATERFALL("Waterfall"),
    UNIFORM_DISTRIBUTION("Uniform Distribution"),
    NON_UNIFORM_DISTRIBUTION("Non-Uniform Distribution");

    String name;
}
