package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalTime;
import java.util.Date;

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
    CREATEDAT("createdAt");
    private String dbKey;
}
