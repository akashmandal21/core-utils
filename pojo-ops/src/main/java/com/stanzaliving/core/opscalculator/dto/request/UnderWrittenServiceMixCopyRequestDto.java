package com.stanzaliving.core.opscalculator.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnderWrittenServiceMixCopyRequestDto {
    private String sourceMonthlyUnderWrittenUuid;
    private String sourceMuwServiceMixUuid;
    private String sourceServiceMixUuid;
    private String destMonthlyUnderWrittenUuid;
    private String destMuwServiceMixUuid;
    private String destServiceMixUuid;

}
