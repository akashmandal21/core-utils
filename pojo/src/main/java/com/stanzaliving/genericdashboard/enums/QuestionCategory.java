package com.stanzaliving.genericdashboard.enums;

public enum QuestionCategory {
    MULTIPLE_CHOICE("MULTIPLE_CHOICE"),
    CHECKBOX("CHECKBOX"),
    DROPDOWN("DROPDOWN"),
    RATING_SLIDER("RATING_SLIDER"),
    RATING_INTEGER("RATING_INTEGER"),
    RATING_STARS("RATING_STARS"),
    RATING_EMOJIS("RATING_EMOJIS"),
    INPUT_STRING("INPUT_STRING"),
    DATE("DATE"),
    TIME("TIME");

    public String questionCategory;

    QuestionCategory(String questionCategory) {
        this.questionCategory = questionCategory;
    }
}
