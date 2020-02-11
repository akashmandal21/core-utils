package com.stanzaliving.versioning.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter

public enum ContentType {

    CSV("csv"),
    HTML("html"),
    XML("XML"),
    JSON("JSON"),
    TEXT("plaintext");


    private String contentTypeName;

    ContentType(String contentTypeName) {
        this.contentTypeName = contentTypeName;
    }

    private static Map<String, ContentType> contentTypeMap = new HashMap<>();
    static {
        for(ContentType contentType: ContentType.values()) {
            contentTypeMap.put(contentType.getContentTypeName(), contentType);
        }
    }

    public static ContentType getContentType(String type) {
        return contentTypeMap.get(type);
    }
}
