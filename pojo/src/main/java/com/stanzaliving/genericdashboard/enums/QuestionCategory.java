package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum QuestionCategory {
    MULTIPLE_CHOICE("Multiple Choice"),
    CHECKBOX("Checkbox"),
    DROPDOWN("Dropdown"),
    RATING_SLIDER("Rating Slider"),
    RATING_INTEGER("Rating Integer"),
    RATING_STARS("Rating Stars"),
    RATING_EMOJIS("Rating Emojis"),
    INPUT_STRING("Input String"),
    DATE("Date"),
    TIME("Time");

    String question;

}
