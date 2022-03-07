package com.stanzaliving.genericdashboard.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;

import com.stanzaliving.genericdashboard.enums.CampaignGroup;
import com.stanzaliving.genericdashboard.validation.DraftValidation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class SurveyDto {

	private String uuid;

	@NotBlank(message = "title of a survey cannot be empty")
	private String surveyTitle;

	private String surveyDescription;
	
	private String campaignName;

	@NotBlank(message = "image cannot be empty")
	private String surveyImageUrl;

	@Builder.Default
	private List<QuestionPageDto> questions = new ArrayList<>();

	@Size(max = 16, message = "cta text can't be more than 16 characters", groups = { DraftValidation.class,
			Default.class })
	private String thankYouCtaText;

	private String thankYouDescription;

	private String thankYouTitle;

	private String thankYouImageUrl;

	private CampaignGroup campaignGroup;
}
