package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Priyadarshini MB
 */

@Getter
@AllArgsConstructor
public enum TaskCategorySortSpecs {

    TASKCATEGORYNAME("taskCategoryName"),
    STARTTIME("startTime"),
    AUTOCOMPLETIONEVENT("autoCompletionEvent"),
    AUTOCOMPLETETASK("autoCompleteTask"),
    CREATEDAT("createdAt"),
    UPDATEAT("updateAt");
    private String dbKey;
}
