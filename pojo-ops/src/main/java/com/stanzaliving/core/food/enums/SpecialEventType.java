package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.generic.dto.UIKeyValue;

import java.util.ArrayList;
import java.util.List;

public enum SpecialEventType {

    EXAMS("Exams"),
    FESTIVAL("Festival"),
    NATIONAL_HOLIDAY("National Holiday"),
    SPECIAL_EVENT("Special Event"),
    OTHER("Other");
    
    private String eventTypeName;
    
    public static List<UIKeyValue> eventTypeUIList = new ArrayList<>();
    
    static {
        for(SpecialEventType eventType : SpecialEventType.values()) {
            eventTypeUIList.add(new UIKeyValue(eventType.eventTypeName,eventType.name()));
        }
    }
    
    SpecialEventType(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
    

}
