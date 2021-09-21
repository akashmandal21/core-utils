package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum SpecialEventType {

    EXAMS("Exams", "E"),
    FESTIVAL("Festival", "F"),
    NATIONAL_HOLIDAY("National Holiday", "N"),
    SPECIAL_EVENT("Special Event", "S"),
    OTHER("Other", "O");
    
    private final String eventTypeName;

    private final String eventTypeInitial;
    
    public static List<UIKeyValue> eventTypeUIList = new ArrayList<>();
    
    static {
        for(SpecialEventType eventType : SpecialEventType.values()) {
            eventTypeUIList.add(new UIKeyValue(eventType.eventTypeName,eventType.name()));
        }
    }

    public static HolidayType getHolidayType(SpecialEventType specialEventType) {
        switch (specialEventType) {
            case EXAMS: return HolidayType.EXAM;
            case NATIONAL_HOLIDAY: return HolidayType.NATIONAL;
            case FESTIVAL: return HolidayType.FESTIVAL;
            default: return HolidayType.OTHER;
        }
    }
    
    SpecialEventType(String eventTypeName,String eventTypeInitial) {
        this.eventTypeName = eventTypeName;
        this.eventTypeInitial = eventTypeInitial;
    }
    

}
