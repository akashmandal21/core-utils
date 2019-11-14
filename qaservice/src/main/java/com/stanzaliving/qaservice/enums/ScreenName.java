package com.stanzaliving.qaservice.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum ScreenName {
    PROPERTY(1, "Property", "Property Analysis"), 
    LOCATION(2, "Location", "Location Analysis"), 
    IMAGES(3, "Images", "Property Images"), 
    LANDLORD(4, "Landlord", "Landlord Analysis"), 
    FINANCIAL(5, "Financial", "Financial Analysis");

    private int id;
    private String name;
    private String heading;

    ScreenName(int id, String name, String heading) {
        this.id=id;
        this.name = name;
        this.heading = heading;
    }

    private static Map<Integer, ScreenName> screenNameMap = new HashMap<>();
    static {
        for(ScreenName screenName:ScreenName.values()) {
            screenNameMap.put(screenName.getId(), screenName);
        }
    }

    public static ScreenName getScreenById(int id) {
        return screenNameMap.get(id);
    }
}
