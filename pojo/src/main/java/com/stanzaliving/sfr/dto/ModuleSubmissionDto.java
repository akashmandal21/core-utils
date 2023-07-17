package com.stanzaliving.sfr.dto;

import com.stanzaliving.sfr.enumeration.ModuleState;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ModuleSubmissionDto {

    private Long moduleSubmissionId;
    
    private ModuleState moduleStatus;

    private String questionTemplateId;

}
