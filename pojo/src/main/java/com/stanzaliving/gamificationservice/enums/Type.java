package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;


@Getter
@AllArgsConstructor
public enum Type {
    SINGLE("SINGLE"), MULTIPLE("MULTIPLE");

    private static final SortedMap<String, Type> typeMap = new TreeMap<String, Type>();

    static {
        for (Type type : Type.values()) {
            typeMap.put(type.getTypeName(), type);
        }
    }

    private final String typeName;

    public static Collection<Type> getType() {
        return typeMap.values();
    }
}
