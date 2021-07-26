package com.stanzaliving.agreement.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateConfigDTO {
    private String propertyName;
    private String propertyType;
    private String propertyValue;
}
