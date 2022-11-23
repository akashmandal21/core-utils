package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public class UniformSummaryDto extends CategorySummaryDto {
    DisplaySummaryDto rcOe;
    DisplaySummaryDto housekeeping;
}
