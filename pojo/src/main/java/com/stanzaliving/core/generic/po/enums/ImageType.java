package com.stanzaliving.core.generic.po.enums;

import java.util.HashMap;

public enum ImageType {

	RECEIVED,
	INSTALLED, 
	RETURNED, 
	REJECTED;
	
	private static HashMap<String, ImageType> types;
    static {
        types = new HashMap<>();
        for (ImageType r : ImageType.values()) {
            types.put(r.toString(), r);
        }
    }

    public static ImageType getImageType(String type) {
        return types.get(type);
    }
	
}
