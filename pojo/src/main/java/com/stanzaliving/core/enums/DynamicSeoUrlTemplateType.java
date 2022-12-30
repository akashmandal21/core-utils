package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DynamicSeoUrlTemplateType {

    STANZA_SPECIFIC("Stanza Specific"),
    OSM_SPECIFIC("OSM Specific");

    private final String dynamicSeoUrlTemplateName;
}
