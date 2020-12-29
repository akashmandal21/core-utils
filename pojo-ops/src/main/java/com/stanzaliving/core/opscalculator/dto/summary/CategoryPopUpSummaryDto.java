package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class CategoryPopUpSummaryDto {
    String annualUnderWrittenUuid;
    String monthlyUnderWrittenUuid;
    String residenceUuid;
    boolean monthPartiallyCovered;
    double costPerAvailableBedPerMonth;
    List<CategoryPopUpSummaryDetailsDto> categoryPopUpSummaryDetailsDtoList;
}
