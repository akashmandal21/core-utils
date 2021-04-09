package com.stanzaliving.campaign_dashboard.dto;

import com.stanzaliving.campaign_dashboard.enums.QuestionCategory;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class QuestionsDto {
    Long id;

    @NotBlank(message = "question cannot be empty")
    String text;

    @NotNull(message = "option type cannot be empty")
    QuestionCategory questionCategory;

    Boolean isLogical;

    Integer position;

    Integer pageNumber;

    @NotNull String options;
}
