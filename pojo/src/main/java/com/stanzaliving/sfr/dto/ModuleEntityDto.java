package com.stanzaliving.sfr.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ModuleEntityDto {

    private String propertyUuid;

    private Long moduleSubmissionId;

    private String questionTemplateId;
    
}
