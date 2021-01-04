package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class CategorySummaryDto {
    @Builder.Default
    DisplaySummaryDto costPerAvailableBed = new DisplaySummaryDto();//to return dummy variable
    @Builder.Default
    boolean changeInServiceMix = new Random().nextBoolean();//to return dummy
}
