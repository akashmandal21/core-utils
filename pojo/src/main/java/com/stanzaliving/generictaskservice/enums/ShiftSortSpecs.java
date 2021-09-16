package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Vikas S T
 * @date 15-Sep-21
 **/

@Getter
@AllArgsConstructor
public enum ShiftSortSpecs {

    SHIFTNAME("shiftName"),
    SHIFTCATEGORY("shiftCategory"),
    DURATIONINHOURS("durationInHours"),
    TAGS("tags");

    private String dbKey;

}

