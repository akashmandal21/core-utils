package com.stanzaliving.generictaskservice.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikas S T
 * @date 31-Aug-21
 **/
@Getter
@AllArgsConstructor
public enum ShiftAllocationDayType {
    SUNDAY("Sunday"),MONDAY("Monday"),
    TUESDAY("Tuesday"),WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),FRIDAY("Friday"),
    SATURDAY("Saturday");

    private static final List<EnumListing<ShiftAllocationDayType>> enumListing = new ArrayList<>();

    static {
        for (ShiftAllocationDayType shiftAllocationDayType : ShiftAllocationDayType.values()) {
            EnumListing<ShiftAllocationDayType> listing = EnumListing.of(shiftAllocationDayType, shiftAllocationDayType.getShiftAllocationDayType());
            enumListing.add(listing);
        }
    }

    private String shiftAllocationDayType;

    public static List<EnumListing<ShiftAllocationDayType>> getEnumListing() {
        return enumListing;
    }
}
