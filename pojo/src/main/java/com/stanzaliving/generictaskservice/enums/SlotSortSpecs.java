package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Vikas S T
 * @date 15-Sep-21
 **/

@Getter
@AllArgsConstructor
public enum SlotSortSpecs {
    SLOTNAME("slotName"),
    OVERLAPPINGALLOWED("overLappingAllowed"),
    RESCHEDULEINGALLOWED("reSchedulingAllowed"),
    MOVEABLESLOT("movableSlot"),
    ALLOWEDTASK("allowedTask"),
    SLOT_STATUS("slotStatus"),
    CREATEDBY("createdBy"),
    UPDATEDAT("updatedAt");

    private String dbKey;
}
