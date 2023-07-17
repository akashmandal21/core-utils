package com.stanzaliving.sfr.enumeration;

import lombok.Getter;

@Getter
public enum PropertyTypeExpand {
    ROLES("roles"),
    MODULES("modules"),
    PROPERTY_STATUES("property_statuses");
    PropertyTypeExpand(String collectionName) {
        this.collectionName = collectionName;
    }

    private final String collectionName;
}
