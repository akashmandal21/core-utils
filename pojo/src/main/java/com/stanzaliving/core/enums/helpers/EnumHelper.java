package com.stanzaliving.core.enums.helpers;

public class EnumHelper {
	
    public static <T extends EnumValue> String getEnumFromValueString(Class<T> enumClass, String value) {

        if (enumClass == null) {
            throw new IllegalArgumentException("EnumClass value can't be null.");
        }
        
        for (T enumValue : enumClass.getEnumConstants()) {
            if (enumValue.getValue().equalsIgnoreCase(value)) {
                return enumValue.name();
            }
        }
        
        return null;
    }
    
    public static <T extends EnumValue> String getValueFromEnumString(Class<T> enumClass, String value) {

        if (enumClass == null) {
            throw new IllegalArgumentException("EnumClass value can't be null.");
        }

        for (T enumValue : enumClass.getEnumConstants()) {
            if (enumValue.name().equalsIgnoreCase(value)) {
                return enumValue.getValue();
            }
        }
        
        return null;
    }
    
}

