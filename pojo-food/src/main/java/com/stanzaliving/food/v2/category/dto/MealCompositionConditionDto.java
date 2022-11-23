package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MealCompositionConditionDto extends CompositionConditionV2Dto {
    private MealType mealType;
}
