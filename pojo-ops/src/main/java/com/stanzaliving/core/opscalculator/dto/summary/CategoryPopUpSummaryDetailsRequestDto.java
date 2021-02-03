package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.core.opscalculator.constants.UnderwrittenCalculatorCategory;
import com.stanzaliving.core.opscalculator.dto.CategoryDto;
import com.stanzaliving.core.opscalculator.dto.UnderWrittenDto;
import com.stanzaliving.core.opscalculator.dto.UnderwrittenCostCategoryDto;
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
    UnderWrittenDto underWrittenDto;
    UnderwrittenCalculatorCategory underwrittenCalculatorCategory;
    String monthlyUnderWrittenServiceMixUuid;
    List<Month> copyDetailsToMonths;
}
