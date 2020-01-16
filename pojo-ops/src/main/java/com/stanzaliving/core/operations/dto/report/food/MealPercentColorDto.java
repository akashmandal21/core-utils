package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.PercentColorDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MealPercentColorDto {

    PercentColorDto overall;

    PercentColorDto breakfast;

    PercentColorDto lunch;

    PercentColorDto snacks;

    PercentColorDto dinner;

}
