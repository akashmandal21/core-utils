/**
 * @author gaurav.likhar
 * @date 10/09/23
 * @project_name core-utils
 **/

package com.stanzaliving.ruleEngine.dto;

public enum DataType {
    INTEGER,
    DECIMAL,
    STRING,
    DATE,
    BOOLEAN,
    FILE_UPLOAD,
    SECTION,
    OBJECT;

    private Object obj;
}
