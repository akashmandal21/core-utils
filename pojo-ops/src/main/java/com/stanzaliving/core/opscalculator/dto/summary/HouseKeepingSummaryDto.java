package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Data
@SuperBuilder
public class HouseKeepingSummaryDto extends CategorySummaryDto{
    private DisplaySummaryDto houseKeeping8Hour;
    private DisplaySummaryDto houseKeeping12Hour;
    private DisplaySummaryDto houseKeepingContractHour;
}
