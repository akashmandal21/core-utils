package com.stanzaliving.agreement.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActionTemplateMappingDTO {
    ActionsDTO actions;

    TemplateDTO template;

    private Long priority;

    private Long retryCount;
}
