package com.stanzaliving.core.food.enums;

import java.util.HashMap;
import java.util.Map;

public enum SpecialEventType {

    EXAMS("Exams"),
    FESTIVAL("Festival"),
    NATIONAL_HOLIDAY("National Holiday"),
    SPECIAL_EVENT("Special Event"),
    OTHER("Other");
    
    private String eventTypeName;
    
    public static Map<String,String> eventTypeMap = new HashMap<>();
    
    static {
        for(SpecialEventType eventType : SpecialEventType.values()) {
            eventTypeMap.put(eventType.toString(),eventType.eventTypeName);
        }
    }
    
    SpecialEventType(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
    

}
