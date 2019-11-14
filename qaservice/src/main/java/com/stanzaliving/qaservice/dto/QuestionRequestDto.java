package com.stanzaliving.qaservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionRequestDto {

    private String questionType;

    private String frontendType;

    private String quesHeading;

    private String quesSubHeading;

    private String questionIdentifier;

    private Integer isMandatory;

    private String visibilityCriteria;

    private Integer screenGroupNum;

    private Integer screenNum;

    private Integer orderNum;

    private String subQuestionDisplay;

    private Long metadataId;

}
