package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.validation.DraftValidation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SurveyDto {
    private String id;

    @NotBlank(message = "title of a survey cannot be empty")
    private String surveyTitle;

    private String surveyDescription;

    @NotBlank(message = "image cannot be empty")
    private String surveyImageUrl;

    private List<QuestionPageDto> questions;

    @Size(
            max = 16,
            message = "cta text can't be more than 16 characters",
            groups = {DraftValidation.class, Default.class})
    private String thankYouCtaText;

    private String thankYouDescription;

    private String thankYouTitle;

    private String thankYouImageUrl;
}
