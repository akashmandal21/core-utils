package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.enums.DispatchSummaryItemType;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DispatchInfoDto {

    private String residenceId;
    private String uuid;
    private DispatchSummaryItemType dispatchSummaryItemType;
    private MealType mealType;

}