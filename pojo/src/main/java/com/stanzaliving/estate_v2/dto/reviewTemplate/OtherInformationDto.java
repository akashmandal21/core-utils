package com.stanzaliving.estate_v2.dto.reviewTemplate;

import com.stanzaliving.sfr.dto.questionTemplate.conditions.VisibilityConditionDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OtherInformationDto {
    private String label;
    private String variableName;
    private String icon;
    private String urlInfo;
    private VisibilityConditionDto visibilityCondition;

}
