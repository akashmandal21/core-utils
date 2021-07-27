package com.stanzaliving.agreement.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateDTO {
    private String templateId;
    private String templateDescription;
    private TemplateConfigDTO templateConfigs;
}
