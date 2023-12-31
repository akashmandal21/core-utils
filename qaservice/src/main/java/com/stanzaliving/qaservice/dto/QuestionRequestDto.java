package com.stanzaliving.qaservice.dto;

import com.stanzaliving.qaservice.enums.QuestionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionRequestDto {

    private QuestionType questionType;
    private String frontendType;
    private String quesHeading;
    private String quesSubHeading;
    private String questionIdentifier;
    private Integer isMandatory;
    private String visibilityCriteria;

    private Integer screenGroupNumber;
    private Integer screenNumber;
    private Integer orderNumber;
    private String subQuestionDisplay;

    private Long metadataId;
    private String metadata;
}
