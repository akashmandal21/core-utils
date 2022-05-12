package com.stanzaliving.sfr.dto;

import com.stanzaliving.sfr.enumeration.ModuleState;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AsIsSubmissionDto {

    private Long asIsEntityId;
    
    private ModuleState moduleStatus;

}
