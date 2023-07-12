package com.stanzaliving.food.v2.order.request;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.food.v2.category.dto.MealWiseMenuDto;
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

    private Map<MealType, List<DayOfWeek>> mealTypeAndApplicableDaysMap;

    private List<MealWiseMenuDto> mealWiseMenus;
}
