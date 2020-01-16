package com.stanzaliving.core.operations.dto.report.food;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MealDto {

    double overall;

    double breakfast;

    double lunch;

    double snacks;

    double dinner;

}
