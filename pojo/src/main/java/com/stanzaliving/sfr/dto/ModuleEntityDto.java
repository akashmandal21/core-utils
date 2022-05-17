package com.stanzaliving.sfr.dto;

import com.stanzaliving.sfr.enumeration.ModuleState;
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
    
    private ModuleState moduleState;
    
}
