package com.stanzaliving.campaign_dashboard.dto;

import com.stanzaliving.campaign_dashboard.validation.DraftValidation;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;
import java.util.List;

public class SurveyDto {
    Long id;

    @NotBlank(message = "title of a survey cannot be empty")
    String surveyTitle;

    String surveyDescription;

    @NotBlank(message = "image cannot be empty")
    String surveyImageUrl;

    List<QuestionPageDto> questions;

    @Size(
            max = 16,
            message = "cta text can't be more than 16 characters",
            groups = {DraftValidation.class, Default.class})
    String thankYouCtaText;

    String thankYouDescription;

    String thankYouTitle;

    String thankYouImageUrl;
}
