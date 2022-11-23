package com.stanzaliving.agreement.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveActionTemplateMappingDTO {

    private String actionName;

    private Boolean isDocGenerationRequired;

    private String templateId;

    private Long priority;

    private Long retryCount;
}
