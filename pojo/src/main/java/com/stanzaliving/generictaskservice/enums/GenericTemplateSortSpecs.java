package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Vikas S T
 * @date 14-Dec-21
 **/
@Getter
@AllArgsConstructor
public enum GenericTemplateSortSpecs {
    NAME("name"),
    CREATEDBY("createdBy"),
    UPDATEDAT("updatedAt");
    private String dbKey;
}
