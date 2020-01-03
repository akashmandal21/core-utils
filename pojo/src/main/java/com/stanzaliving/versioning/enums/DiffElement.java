package com.stanzaliving.versioning.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum DiffElement
{

        ADD("add","Added"),
        REMOVE("remove", "Removed"),
        MOVED("move", "Moved"),
        CHANGED("", "Changed");

        private String property;
        private String heading;

        DiffElement(String property, String heading) {
            this.property = property;
            this.heading = heading;
        }

        private static Map<String, DiffElement> diffElementMap = new HashMap<>();
        static {
            for(DiffElement diffType: DiffElement.values()) {
                diffElementMap.put(diffType.getProperty(), diffType);
            }
        }

        public static DiffElement getDiffElementByProperty(String property) {
            return diffElementMap.getOrDefault(property,CHANGED);
        }


}
