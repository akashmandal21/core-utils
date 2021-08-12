package com.stanzaliving.generictaskservice.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikas S T
 * @date 02-Aug-21
 **/

@Getter
@AllArgsConstructor
public enum SlotType {
    TASK("Task"),NON_TASK("Non task");

    private String slotTypeName;

    private static final List<EnumListing<SlotType>> enumListing = new ArrayList<>();

    public static List<EnumListing<SlotType>> getEnumListing() {
        return enumListing;
    }

    static {
        for (SlotType slotType : SlotType.values()) {
            EnumListing<SlotType> listing = EnumListing.of(slotType, slotType.getSlotTypeName());
            enumListing.add(listing);
        }
    }
}
