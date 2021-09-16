package com.stanzaliving.housekeepingservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Vikas S T
 * @date 17-Sep-21
 **/
@Getter
@AllArgsConstructor
public enum HkTemplateSortSpecs {

    TEMPLATE_NAME("templateName"),
    MICROCLUSTER("microClusterUuid"),
    CREATED_BY("createdBy"),
    TAGS("tags"),
    STATUS("templateStatus");

    private String dbKey;

}
