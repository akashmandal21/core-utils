package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SkuBudgetRequestDto {

    private String menuCategoryId;
    private Map<MealType, List<DayOfWeek>> mealTypeAndApplicableDaysMap;
}
