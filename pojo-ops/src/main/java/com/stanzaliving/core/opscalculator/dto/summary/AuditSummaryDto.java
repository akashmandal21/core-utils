package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
public class AuditSummaryDto extends CategorySummaryDto{
    DisplaySummaryDto physicalAudit;
    DisplaySummaryDto cctvAudit;
}
