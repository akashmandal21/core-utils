package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuGroupPreviousMenuDto {
    Map<DayOfWeek,Map<MealType, Map<String, MealFoodMenuDto>>> dayWiseMealMenu;
}
