package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.support.enums.FaqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaqResidenceDto {
    private String residenceName;
    private String residenceUuid;
    private FaqStatus status;
}
