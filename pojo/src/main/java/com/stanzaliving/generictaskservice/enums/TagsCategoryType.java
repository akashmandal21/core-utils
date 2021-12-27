package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Vikas S T
 * @date 09-Dec-21
 **/

@Getter
@AllArgsConstructor
public enum TagsCategoryType {

    SHIFT("SHIFT"),
    SLOT("SLOT"),
    GUARDRAIL_TEMPLATE("GUARDRAIL_TEMPLATE"),
    TASK_TYPE("TASK_TYPE");

    private static final SortedMap<String, TagsCategoryType> tagsCategoryTypeMap = new TreeMap<>();

    static {
        for (TagsCategoryType tagsCategoryType : TagsCategoryType.values()) {
            tagsCategoryTypeMap.put(tagsCategoryType.getTagsCategoryTypeName(), tagsCategoryType);
        }
    }

    private String tagsCategoryTypeName;

    public static Collection<TagsCategoryType> getTagsCategoryType() {
        return tagsCategoryTypeMap.values();
    }

}
