package com.stanzaliving.qaservice.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public enum QuestionType {

    TEXT("TEXT"), 
    SINGLE_CHOICE("SINGLE_CHOICE"),
    ON_TAP("ON_TAP"),
    ON_TAP_SINGLE_CHOICE("ON_TAP_SINGLE_CHOICE"),
    ON_TAP_MULTIPLE_CHOICE("ON_TAP_MULTIPLE_CHOICE"),
    DATE("DATE"),
    BUILDING_BOUNDARY("BUILDING_BOUNDARY"), 
    K_QUESTION("K_QUESTION"), 
    MULTIPLE_CHOICE("MULTIPLE_CHOICE"), 
    BOOL("BOOL"), 
    IMAGE("IMAGE"),
    ATTACH_QUESTION_TEXT("ATTACH_QUESTION_TEXT"),
    ATTACH_QUESTION_DROPDOWN("ATTACH_QUESTION_DROPDOWN"),
    ATTACH_SUBSCREEN_QUESTION("ATTACH_SUBSCREEN_QUESTION"),
    FIXED_QUESTION("FIXED_QUESTION"),
    K_QUESTION_WITH_SCREEN("K_QUESTION_WITH_SCREEN");

    public String questionType;

    QuestionType(String questionType) {
        this.questionType = questionType;
    }

}
