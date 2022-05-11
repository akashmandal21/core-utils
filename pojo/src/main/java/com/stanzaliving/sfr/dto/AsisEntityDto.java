package com.stanzaliving.sfr.dto;

import com.stanzaliving.core.asis.enums.SiteVisitStatus;
import com.stanzaliving.core.projectservice.enums.AsIsStatus;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AsisEntityDto {

    private String propertyUuid;

    private Long asIsEntityId;

    private String questionTemplateId;
    
}
