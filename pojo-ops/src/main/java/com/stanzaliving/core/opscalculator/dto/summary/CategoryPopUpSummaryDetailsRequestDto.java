package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.core.opscalculator.dto.CategoryDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Month;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class CategoryPopUpSummaryDetailsRequestDto {
    CategoryDto categoryDto;
    String serviceMixUuid;
    String monthlyUnderWrittenServiceMixUuid;
    List<Month> copyDetailsToMonths;
    String annualUnderWrittenUuid;
    String monthlyUnderWrittenUuid;
}
