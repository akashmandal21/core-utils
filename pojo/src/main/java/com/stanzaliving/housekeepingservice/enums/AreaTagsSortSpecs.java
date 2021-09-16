package com.stanzaliving.housekeepingservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Vikas S T
 * @date 17-Sep-21
 **/
@Getter
@AllArgsConstructor
public enum AreaTagsSortSpecs {
    NAME("areaTagName"),
    CATEGORY("areaCategoryUuid"),
    CREATEDBY("createdBy"),
    AREA_TAG_STATUS("areaTagStatus");
    private String dbKey;
}
