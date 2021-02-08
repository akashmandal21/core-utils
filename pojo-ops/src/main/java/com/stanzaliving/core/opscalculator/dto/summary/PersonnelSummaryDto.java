package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
public class PersonnelSummaryDto extends CategorySummaryDto {
    DisplaySummaryDto rc;
    DisplaySummaryDto oe;
}
