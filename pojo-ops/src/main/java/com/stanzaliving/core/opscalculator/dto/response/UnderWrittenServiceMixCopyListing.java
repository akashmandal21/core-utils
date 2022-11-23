package com.stanzaliving.core.opscalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnderWrittenServiceMixCopyListing {
    private String monthlyUnderWrittenUuid;
    private String muwServiceMixUuid;
    private String serviceMixUuid;
    private String displayName;
}
