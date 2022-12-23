package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.QuestionCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionsDto {

    private String uuid;

    @NotBlank(message = "question cannot be empty")
    private String text;

    @NotNull(message = "option type cannot be empty")
    private QuestionCategory questionCategory;

    private Boolean isLogical;

    private Integer position;

    private Integer pageNumber;

    @NotNull
    private String options;

    private Boolean isSurveyConfigurable=Boolean.FALSE;

    private Integer maxMultipleChoicesCount;

    private Boolean isCommentOptional;
}
