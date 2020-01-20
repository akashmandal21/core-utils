package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MealResponseDto {

    FeElementDto overall;

    FeElementDto breakfast;

    FeElementDto lunch;

    FeElementDto snacks;

    FeElementDto dinner;

    FeElementDto brunch;

}
