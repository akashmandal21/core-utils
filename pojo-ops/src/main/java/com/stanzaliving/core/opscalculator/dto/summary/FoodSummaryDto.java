package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Data
@SuperBuilder
public class FoodSummaryDto extends CategorySummaryDto {
    DisplaySummaryDto holidays;
    DisplaySummaryDto utilizationPercent;
    DisplaySummaryDto menuPricePerDay;
}
