package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class CopyDataHelperDto {
    String monthlyUnderwrittenServiceMixUuid;
    String serviceMixDisplayName;
    String serviceMixUuid;
    String serviceMixName;

}
