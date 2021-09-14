package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum SpecialEventType {

    EXAMS("Exams", "E"),
    FESTIVAL("Festival", "F"),
    NATIONAL_HOLIDAY("National Holiday", "N"),
    SPECIAL_EVENT("Special Event", "S"),
    OTHER("Other", "O");
    
    private String eventTypeName;

    private String eventTypeInitial;
    
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
