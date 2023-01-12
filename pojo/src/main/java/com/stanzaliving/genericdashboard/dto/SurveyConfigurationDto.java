package com.stanzaliving.genericdashboard.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SurveyConfigurationDto {

    private Boolean status=Boolean.FALSE;

    private Integer checkboxOptionsAllowed;

    private Boolean isCommentOptional;

}
