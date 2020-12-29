package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.core.opscalculator.dto.CategoryDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class CategoryPopUpSummaryDetailsDto {
    CategoryDto categoryDto;
    Double costPerAvailableBedPerMonth;//confirm, if its per day or per month
    String serviceMixUuid;
    String serviceMixDisplayName;
    String monthlyUnderWrittenServiceMixUuid;
    boolean changeInServiceMix;
}
