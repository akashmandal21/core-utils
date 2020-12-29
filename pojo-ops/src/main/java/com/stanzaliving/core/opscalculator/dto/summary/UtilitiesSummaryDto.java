package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Data
@SuperBuilder
public class UtilitiesSummaryDto extends CategorySummaryDto {
    DisplaySummaryDto water;
    DisplaySummaryDto waterFixed;
    DisplaySummaryDto waterVariable;
    DisplaySummaryDto waterLandlordReceivable;

    DisplaySummaryDto electricity;
    DisplaySummaryDto electricityFixed;
    DisplaySummaryDto electricityVariable;
    DisplaySummaryDto electricityAcPassthrough;
    DisplaySummaryDto electricityRoomPassthrough;
    DisplaySummaryDto electricityLandlordReceivable;

    DisplaySummaryDto roomMeterOpexCostPerMeter;
    DisplaySummaryDto dg;

}
