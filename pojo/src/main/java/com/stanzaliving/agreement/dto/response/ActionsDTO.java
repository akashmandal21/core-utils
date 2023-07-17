package com.stanzaliving.agreement.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActionsDTO {
    private String actionType;
    private String actionName;
    private Boolean isDocGenerationRequired;
}
