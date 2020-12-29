package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.core.operations.enums.FeElementType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Data
@SuperBuilder
public class DisplaySummaryDto {
    Double annualUnderwrittenValue;         //should be Object
    Double monthlySplitterValue;            //should be Object
    String colorCode;
//    @Builder.Default
//    FeElementType feElementType = FeElementType.CURRENCY_INTEGER;
}
